package com.integrella.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("IntegrellaMicroservicesApplication.xml")
public class IntegrellaMicroservicesApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext ctx = new SpringApplication(IntegrellaMicroservicesApplication.class).run(args);
        System.out.println("Integrella MDM Adapter started.\nHit Enter to terminate");
        System.in.read();
        ctx.close();
	}
}