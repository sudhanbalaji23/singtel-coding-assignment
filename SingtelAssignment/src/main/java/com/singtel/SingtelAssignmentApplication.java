package com.singtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.singtel.animal.Animal;
import com.singtel.animal.Bird;
import com.singtel.animal.Cat;
import com.singtel.animal.Chicken;
import com.singtel.animal.Dog;
import com.singtel.animal.Duck;
import com.singtel.animal.Parrot;
import com.singtel.animal.Phone;
import com.singtel.animal.Rooster;
import com.singtel.animal.RoosterAlternate;

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
		// Question A.3
		System.out.println("Question A.3 ::::: Rooster :::::");
		Animal rooster = new Rooster();
		rooster.walk();
		rooster.fly();
		rooster.sing();
		System.out.println("Question A.3 ::::: RoosterAlternate :::::");
		RoosterAlternate roosterImposter = new RoosterAlternate();
		roosterImposter.walk();
		roosterImposter.fly();
		roosterImposter.sing();
		// Question A.4
		System.out.println("Question A.4 ::::: dogSoundingParrot :::::");
		Parrot dogSoundingParrot = new Parrot(new Dog());
		dogSoundingParrot.walk();
		dogSoundingParrot.fly();
		dogSoundingParrot.sing();
		System.out.println("Question A.4 ::::: catSoundingParrot :::::");
		Parrot catSoundingParrot = new Parrot(new Cat());
		catSoundingParrot.walk();
		catSoundingParrot.fly();
		catSoundingParrot.sing();
		System.out.println("Question A.4 ::::: roosterSoundingParrot :::::");
		Parrot roosterSoundingParrot = new Parrot(new Rooster());
		roosterSoundingParrot.walk();
		roosterSoundingParrot.fly();
		roosterSoundingParrot.sing();
		System.out.println("Question A.4 ::::: phoneSoundingParrot :::::");
		Parrot phoneSoundingParrot = new Parrot(new Phone());
		phoneSoundingParrot.walk();
		phoneSoundingParrot.fly();
		phoneSoundingParrot.sing();
	}

}
