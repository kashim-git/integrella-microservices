package com.integrella.refdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * Main Spring boot application class
 * Note that the \@ComponentScan annotation to advise Spring Boot where to pick up 
 * the Spring components
 * 
 * @author Kashim
 *
 */
@SpringBootApplication
@ComponentScan("com.integrella.refdata.repository.rest")
public class IntegrellaRefDataApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrellaRefDataApiApplication.class, args);
	}
}
