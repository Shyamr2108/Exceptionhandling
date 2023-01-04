package com.example.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PostExceptionHandlingApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(PostExceptionHandlingApplication.class, args);
	}

}
