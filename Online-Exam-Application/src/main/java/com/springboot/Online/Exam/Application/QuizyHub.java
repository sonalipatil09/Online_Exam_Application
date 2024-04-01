package com.springboot.Online.Exam.Application;

import org.springframework.boot.SpringApplication;    
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class QuizyHub {

	public static void main(String[] args) {
		SpringApplication.run(QuizyHub.class, args);
		System.out.println("SpringBoot Running....!");
	}
}
