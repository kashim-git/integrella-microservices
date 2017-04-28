package com.integrella.microservices.transformer.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.rabbitmq.client.impl.Environment;

/**
 * This call will load the xpath mappings for the source 
 * xml file
 * @author Kashim 
 * 
 */
@Configuration
@PropertySource("classpath*:source-xpaths.properties")
public class XpathLookupConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer xpathExpressionsProperties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
