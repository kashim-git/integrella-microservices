# Integrella Microserices Architecture for Integration

This project forms part of the Suite of products that offer Inegration services in a Microservice Architecture

## This project - Microservices Reference Data API Pivotal

This is a starter project to demonstrate the use of Spring Boot to develop a simple, configurable Microservice that exposes APIs to access data stored in a local mongoDB. The instance is deployed and executed on Pivotal Cloud Foundry

Note that this is a pure Spring Boot application and as such does not contain a Spring Bean XML file for configuration. 


## Getting Started

Download the project to your local eclipse installation. 

### Prerequisites

Your Eclipse Installation needs to have the Spring Tool Suite Addon

You'll also need an account with Pivotal Cloud Foundry. From your console 

1. Create a workspace add the following services:
2. Add the following service: mLab mongoDB

Note that you don't have to the above instance, any instance can be used via the settings in the application.properties file to an external / cloud instance. 

e.g. 

	spring.data.mongodb.uri=mongodb://integrella:integrella@ds161410.mlab.com:61410/integrella_mongodb

Next you need to add the Pivotal CF instance to your Spring Boot dashboad in Eclipse:

Click the '+' and in the following dialog enter your login credentials and URL: https://api.run.pivotal.io 


### Deploying 

Drag and drop the project onto the Cloud Foundry Target to initiate the upload and start of the application in Pivotal CF
(There are also command line utilities that can be used to do the same if you install Pivotal CLI)

You will be promted with another dialog to edit a YAML file - update as below. 

		applications:
		- name: integrella-microservices-refdata-api-pivotal
		  host: integrella-microservices-refdata-api-pivotal
		  memory: 1024M
		  buildpack: java_buildpack
		  domain: cfapps.io


### Execution

Open the browser or postman

https://integrella-microservices-refdata-api-pivotal.cfapps.io/ - This will show the APIs exposed

https://integrella-microservices-refdata-api-pivotal.cfapps.io/referenceData - All data returned as JSON

https://integrella-microservices-refdata-api-pivotal.cfapps.io/referenceData/search - the APIs that we've defined


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
* **integrella-microservices-refdata**


## Authors

* **Kashim Choudhury** (initial version)

