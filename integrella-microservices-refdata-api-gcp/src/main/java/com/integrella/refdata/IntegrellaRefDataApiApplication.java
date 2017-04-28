package com.integrella.refdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.integrella.refdata.repository.rest")
@RestController
public class IntegrellaRefDataApiApplication {
	
	  @RequestMapping("/")
	  public String home() {
	    return "Integrella Reference Data API";
	  }


	public static void main(String[] args) {
		SpringApplication.run(IntegrellaRefDataApiApplication.class, args);
	}
	
	  /**
	   * <a href="https://cloud.google.com/appengine/docs/flexible/java/how-instances-are-managed#health_checking">
	   * App Engine health checking</a> requires responding with 200 to {@code /_ah/health}.
	   */
	  @RequestMapping("/_ah/health")
	  public String healthy() {
	    // Message body required though ignored
	    return "Still surviving.";
	  }
}
