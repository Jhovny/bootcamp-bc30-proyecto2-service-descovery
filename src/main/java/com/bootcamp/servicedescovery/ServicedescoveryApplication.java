package com.bootcamp.servicedescovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServicedescoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicedescoveryApplication.class, args);
	}

}
