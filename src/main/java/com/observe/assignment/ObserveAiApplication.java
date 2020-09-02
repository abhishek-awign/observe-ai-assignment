package com.observe.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.observe.assignment"})
@ComponentScan({"com.observe.assignment","com.observe.assignment.service", "com.observe.assignment.model"})
@EntityScan({"com.observe.assignment.model","com.observe.assignment.model.domain","com.observe.assignment.model.data"})
public class ObserveAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserveAiApplication.class, args);
	}

}
