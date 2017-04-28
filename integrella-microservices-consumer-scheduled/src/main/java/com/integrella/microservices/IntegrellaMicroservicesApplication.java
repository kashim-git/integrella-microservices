package com.integrella.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.integrella.microservices.scheduler.CustomScheduler;

@SpringBootApplication
@ImportResource("IntegrellaMicroservicesApplication.xml")
@EnableScheduling
public class IntegrellaMicroservicesApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext ctx = new SpringApplication(IntegrellaMicroservicesApplication.class).run(args);
		MessageChannel controlChannel = ctx.getBean("controlChannel", MessageChannel.class);
		
		/*
		System.out.println("Enter command <start|stop|shutdown>");

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()){

			String command = scanner.nextLine();
			if (command.equalsIgnoreCase("start")){
				controlChannel.send(new GenericMessage<String>("@inbound.start()"));
				
			}else if (command.equalsIgnoreCase("stop")){
				controlChannel.send(new GenericMessage<String>("@inbound.stop()"));

			}else if (command.equalsIgnoreCase("shutdown")){
				System.out.println("Shutting down Adapter");
		        ctx.close();
		        break;
			}
			System.out.println("Enter command <start|stop|shutdown>");

		}
		*/
		
		CustomScheduler scheduler = new CustomScheduler(controlChannel);
	}
}