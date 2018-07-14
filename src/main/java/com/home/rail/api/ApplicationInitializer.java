package com.home.rail.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationInitializer {
	
	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/rail-api");
		SpringApplication.run(ApplicationInitializer.class, args);
	}
}
