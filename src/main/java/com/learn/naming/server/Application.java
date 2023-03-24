package com.learn.naming.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {

	//Check Eureka server
	//http://localhost:8761/
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
