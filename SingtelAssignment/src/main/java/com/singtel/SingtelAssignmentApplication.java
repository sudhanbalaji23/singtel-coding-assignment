package com.singtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.singtel.animal.Bird;

@SpringBootApplication
public class SingtelAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingtelAssignmentApplication.class, args);
		
		// A. Let’s start with the basics 
		Bird bird = new Bird(); 
        bird.walk(); 
        bird.fly(); 
        bird.sing(); 

	}

}
