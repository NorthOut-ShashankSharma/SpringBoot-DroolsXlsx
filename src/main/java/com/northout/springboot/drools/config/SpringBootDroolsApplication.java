package com.northout.springboot.drools.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.northout.springboot.drools")
public class SpringBootDroolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDroolsApplication.class, args);
	}

}
