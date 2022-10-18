package com.spring_boot_login.backendproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring_boot_login.backendproject"})
public class SpringBootLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginApplication.class, args);
	}

}
