package com.dennis.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dennis.location","com.dennis.location.service"})
public class LocationWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationWebAppApplication.class, args);
	}
}
