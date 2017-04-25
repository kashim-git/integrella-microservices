package com.integrella.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("IntegrellaMicroservicesApplication.xml")
public class IntegrellaMicroservicesConsumerApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext ctx = new SpringApplication(IntegrellaMicroservicesConsumerApplication.class).run(args);
        System.out.println("Integrella Microservices Consumer started.\nHit Enter to terminate");
        System.in.read();
        ctx.close();
	}
}