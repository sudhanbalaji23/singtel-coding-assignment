package com.singtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.singtel.animal.Animal;
import com.singtel.animal.Bird;
import com.singtel.animal.Chicken;
import com.singtel.animal.Duck;

@SpringBootApplication
public class SingtelAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingtelAssignmentApplication.class, args);

		// A. Let’s start with the basics
		System.out.println("Question A.1 ::::: Birdie :::::");
		Animal bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		// Question A.2
		System.out.println("Question A.2 ::::: Chicken :::::");
		Animal chicken = new Chicken();
		chicken.walk();
		chicken.fly();
		chicken.sing();
		System.out.println("Question A.2 ::::: Duck :::::");
		Animal duck = new Duck();
		duck.walk();
		duck.fly();
		duck.sing();
		duck.swim();
	}

}
