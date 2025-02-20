package com.example.exception_managment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@EntityScan(basePackages = {"com.exception_managment"})
@EnableJpaRepositories(basePackages = {"com.exception_managment"})
@ComponentScan(basePackages = {"com.exception_managment"})
@EnableScheduling
@SpringBootApplication
public class ExceptionManagmentApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExceptionManagmentApplication.class, args);
	}

}
