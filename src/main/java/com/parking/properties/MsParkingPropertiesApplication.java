package com.parking.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsParkingPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsParkingPropertiesApplication.class, args);
	}

}
