package com.singtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.singtel.animal.Animal;
import com.singtel.animal.Bird;
import com.singtel.animal.Butterfly;
import com.singtel.animal.Cat;
import com.singtel.animal.Chicken;
import com.singtel.animal.ClownFish;
import com.singtel.animal.Dog;
import com.singtel.animal.Dolphin;
import com.singtel.animal.Duck;
import com.singtel.animal.Fish;
import com.singtel.animal.Parrot;
import com.singtel.animal.Phone;
import com.singtel.animal.Rooster;
import com.singtel.animal.RoosterAlternate;
import com.singtel.animal.Shark;

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
		// Question B.1
		System.out.println("Question B.1 ::::: Shark :::::");
		Shark shark = new Shark();
		shark.fly();
		shark.sing();
		shark.walk();
		shark.swim();
		shark.colour();
		shark.eat();
		shark.joke();
		System.out.println("Question B.1 ::::: ClownFish :::::");
		ClownFish clownFish = new ClownFish();
		clownFish.fly();
		clownFish.sing();
		clownFish.walk();
		clownFish.swim();
		clownFish.colour();
		clownFish.eat();
		clownFish.joke();
		// Can use any fish as a constructor argument
		System.out.println("Question B.1 ::::: Dolphin :::::");
		Dolphin dolphin = new Dolphin();
		dolphin.fly();
		dolphin.sing();
		dolphin.swim();
		dolphin.walk();
		// Question B.2
		System.out.println("Question B.2 ::::: Butterfly :::::");
		Butterfly butterfly = new Butterfly();
		butterfly.setCaterpillar(false);
		butterfly.fly();
		butterfly.sing();
		butterfly.walk();
		System.out.println("Question B.2 ::::: Caterpillar :::::");
		Butterfly caterpillar = new Butterfly();
		caterpillar.setCaterpillar(true);
		caterpillar.fly();
		caterpillar.sing();
		caterpillar.walk();

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(new Bird()),
				new Fish(), new Shark(), new ClownFish(), new Dolphin(), new Dog(), new Butterfly(), new Cat() };

		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;

		for (Animal animal : animals) {
			if (animal.fly()) {
				flyCount++;
			}
			if (animal.walk()) {
				walkCount++;
			}
			if (animal.sing()) {
				singCount++;
			}
			if (animal.swim()) {
				swimCount++;
			}
		}
		System.out.println("Question E ::::: Counting Animals :::::");
		System.out.println("No. of Animals that can fly: " + flyCount);
		System.out.println("No. of Animals that can walk: " + walkCount);
		System.out.println("No. of Animals that can sing: " + singCount);
		System.out.println("No. of Animals that can swim: " + swimCount);
	}

}
