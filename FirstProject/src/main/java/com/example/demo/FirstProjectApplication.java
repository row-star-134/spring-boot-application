package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		System.out.println("Starting Spring Boot application");
		
		//create variable 
		
		Alien A1 = context.getBean(Alien.class);
		A1.Maker();
		
	}

}
