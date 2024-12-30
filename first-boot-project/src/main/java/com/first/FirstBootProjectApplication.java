package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//@ComponentScan(basePackages = {"com.first","pack"})

public class FirstBootProjectApplication {

	public static void main(String[] args) {

		//bootstrapping your spring boot application
		SpringApplication.run(FirstBootProjectApplication.class, args);
	}

}
