package com.hanie.JavaTest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTestApplication.class, args);
	}

	@Bean
	CommandLineRunner omidi(){
		return args -> {
			System.out.println("my name is omid:)");
			System.out.println("i love hanie:)");
		};
	}

}
