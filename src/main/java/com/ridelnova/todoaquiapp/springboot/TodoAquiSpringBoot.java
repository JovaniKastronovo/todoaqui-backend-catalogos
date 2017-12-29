package com.ridelnova.todoaquiapp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication(scanBasePackages={"com.ridelnova.todoaquiapp"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class TodoAquiSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(TodoAquiSpringBoot.class, args);
	}
}
