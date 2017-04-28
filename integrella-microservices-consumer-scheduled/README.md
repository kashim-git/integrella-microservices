# Integrella Microserices Architecture for Integration

This project forms part of the Suite of products that offer Inegration services in a Microservice Architecture

## This project - Microservices Producer scheduled

This is a starter project to demonstrate the use of Spring Integration and Spring Boot to develop a simple, configurable Microservice. A start/stop schedule is registered on the inbound channel which picks up data from a queue, performs some optional transformation and pushes it to an output queue. The queue infrastructure must be AMQP compliant and this project uses RabbitMQ as the provider. 

This project executes as follows: 
1. Control Component registered on inbound-channel-adapter
2. At the configured time, the amqp inbound-channel-adapter starts and picks up any messages from q.adapter.inbound
3. sends message to transformer invoking com.integrella.microservices.transformer.TransformMessage.transform()
4. amqp outbound-channel-adapter sends message to exchange: mdm.esb.exchange, queue: q.mdm.esb
5. At the configured time, the amqp inbound-channel-adapter stops
		
NB1: wiretap defined on channels to log payloads passing through

NB2: INFRASTRUCTURE section below contains details to connect to RabbitMQ	

NB3. Implement src\main\java\com\integrella\microservices\scheduler\CustomScheduler.java and change the cron settings to modify the start and stop times

## Getting Started

Download the project to your local eclipse installation. 

### Prerequisites

Your Eclipse Installation needs to have the Spring Tool Suite Addon

For this project to execute, you'll need a Rabbit MQ server to connect to. 

* If you have a local installation, and it's running on the default settings, then the application will automatically pick up the server details and connect to it. i.e.

	http://localhost:15672 guest/guest

* For an external server, connection details can be configured in the src\main\resources\IntegrellaMicroservicesApplication.xml file in the <!-- INFRASTRUCTURE --> section. 

### Executing

Once the project is in your workspace, open the src\main\java\com\integrella\microservices\scheduler\CustomScheduler.java class
Modify the cron annotation for the start and stop methods. 

Run the application as a Spring Boot Application. Any messages will only be picked up between the start and stop times. 

Open the a browser @ http://localhost:15672

The following queues are defined:
q.adapter.inbound
q.mdm.esb

Publish a message to q.adapter.inbound
It will be picked up, transformed to UPPERCASE and published to q.mdm.esb

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

Use maven to create the required jars to execute as a standalone application. 

You can run the application using 

	./mvnw spring-boot:run. 

Or you can build the JAR file with
	 
	 ./mvnw clean package. 

Then you can run the JAR file:

	java -jar target/integrella-microservices-producer-1.0.0.jar


## See also

* **integrella-microservices-consumer**
* **integrella-microservices-producer-scheduled**
* **integrella-microservices-producer-xslt**


## Authors

* **Kashim Choudhury** (initial version)

