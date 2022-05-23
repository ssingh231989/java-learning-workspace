package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:spring/main-application-context.xml"})
@SpringBootApplication
public class SpringbootLearningAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearningAppApplication.class, args);
	}

}
