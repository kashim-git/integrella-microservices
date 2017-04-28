# Integrella Microserices Architecture for Integration

This project forms part of the Suite of products that offer Inegration services in a Microservice Architecture

## This project - Microservices Reference Data API

This is a starter project to demonstrate the use of Spring Boot to develop a simple, configurable Microservice that exposes APIs to access data stored in a local mongoDB

Note that this is a pure Spring Boot application and as such does not contain a Spring Bean XML file for configuration. 


## Getting Started

Download the project to your local eclipse installation. 

### Prerequisites

Your Eclipse Installation needs to have the Spring Tool Suite Addon

For this project to execute, you'll need a local Mongo DB instance running or point the settings in the application.properties file to an external / cloud instance. 

e.g. 

	spring.data.mongodb.uri=mongodb://integrella:integrella@ds161410.mlab.com:61410/integrella_mongodb


### Executing

Once the project is in your workspace, run the application as a Spring Boot Application. 

Open the browser or postman

http://localhost:8080 - This will show the APIs exposed

http://localhost:8080/referenceData - All data returned as JSON

http://localhost:8080/referenceData/search - the APIs that we've defined


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

Use maven to create the required jars to execute as a standalone application. 

You can run the application using 

	./mvnw spring-boot:run. 

Or you can build the JAR file with
	 
	 ./mvnw clean package. 

Then you can run the JAR file:

	java -jar target/integrella-microservices-refdata-api-1.0.0.jar


## See also

* **integrella-microservices-refdata-gcp**
* **integrella-microservices-refdata-pivotal**


## Authors

* **Kashim Choudhury** (initial version)

