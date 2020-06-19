package com.singtel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.singtel.animal.Animal;
import com.singtel.animal.Bird;
import com.singtel.animal.Cat;
import com.singtel.animal.Chicken;
import com.singtel.animal.ClownFish;
import com.singtel.animal.Dog;
import com.singtel.animal.Dolphin;
import com.singtel.animal.Duck;
import com.singtel.animal.Fish;
import com.singtel.animal.Objects;
import com.singtel.animal.Parrot;
import com.singtel.animal.Phone;
import com.singtel.animal.Rooster;
import com.singtel.animal.RoosterAlternate;
import com.singtel.animal.Shark;

@SpringBootTest
class SingtelAssignmentApplicationTests {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Test
	void contextLoads() {
	}

	@BeforeEach
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}
	
	@AfterEach
	public void restoreStreams() {
	    System.setOut(originalOut);
	}
	
	@Test
	public void validateBird() throws IOException {
		Animal bird = new Bird(); 
		bird.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
        bird.fly(); 
        assertEquals("I am flying", outContent.toString().trim());
        outContent.reset();
        bird.sing(); 
        assertEquals("La.. La.. La..", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validateChicken() throws IOException {
		Animal chicken = new Chicken(); 
		chicken.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
		chicken.fly(); 
        assertEquals("Flying.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
        chicken.sing(); 
        assertEquals("Cluck, cluck", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validateDuck() throws IOException {
		Animal duck = new Duck(); 
		duck.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
		duck.fly(); 
        assertEquals("I am flying", outContent.toString().trim());
        outContent.reset();
        duck.sing(); 
        assertEquals("Quack, quack", outContent.toString().trim());
        outContent.reset();
        duck.swim(); 
        assertEquals("Splash.. Splash..", outContent.toString().trim());
        outContent.reset();
        
    }
	
	@Test
	public void validateRooster() throws IOException {
		Animal rooster = new Rooster(); 
		rooster.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
		rooster.fly(); 
        assertEquals("Flying.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
        rooster.sing(); 
        assertEquals("Cock-a-doodle-doo", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validateRoosterAlternate() throws IOException {
		RoosterAlternate rooster = new RoosterAlternate(); 
		rooster.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
		rooster.fly(); 
        assertEquals("Flying.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
        rooster.sing(); 
        assertEquals("Cock-a-doodle-doo", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validateDog() throws IOException {
		Animal dog = new Dog(); 
		dog.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
		dog.fly(); 
        assertEquals("Flying.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
        dog.sing(); 
        assertEquals("Woof, woof", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validateCat() throws IOException {
		Animal cat = new Cat(); 
		cat.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
		cat.fly(); 
        assertEquals("Flying.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
        cat.sing(); 
        assertEquals("Meow", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validatePhone() throws IOException {
		Objects phone = new Phone(); 
        phone.sing(); 
        assertEquals("Tring.. Tring..", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validateParrot() throws IOException {
		Animal dogSoundingParrot = new Parrot(new Dog()); 
		dogSoundingParrot.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
		dogSoundingParrot.fly(); 
        assertEquals("I am flying", outContent.toString().trim());
        outContent.reset();
        dogSoundingParrot.sing(); 
        assertEquals("Woof, woof", outContent.toString().trim());
        outContent.reset();
        
        Animal catSoundingParrot = new Parrot(new Cat()); 
        catSoundingParrot.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
		catSoundingParrot.fly(); 
        assertEquals("I am flying", outContent.toString().trim());
        outContent.reset();
        catSoundingParrot.sing(); 
        assertEquals("Meow", outContent.toString().trim());
        outContent.reset();
        
        Animal phoneSoundingParrot = new Parrot(new Phone()); 
        phoneSoundingParrot.sing(); 
        assertEquals("Tring.. Tring..", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validateShark() throws IOException {
		Fish shark = new Shark(); 
		shark.walk(); 
		assertEquals("Walking.. Nay.. Nay..", outContent.toString().trim());
		outContent.reset();
		shark.fly(); 
        assertEquals("Flying.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
        shark.sing(); 
        assertEquals("Singing.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
    	shark.swim();
    	assertEquals("Splash.. Splash..", outContent.toString().trim());
        outContent.reset();
		shark.colour();
		assertEquals("I am grey", outContent.toString().trim());
        outContent.reset();
		shark.eat();
		assertEquals("Yummy Yeah.. I eat other fishes", outContent.toString().trim());
        outContent.reset();
		shark.joke();
		assertEquals("Funny?!? Never..", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validateClownFish() throws IOException {
		Fish clownfish = new ClownFish(); 
		clownfish.walk(); 
		assertEquals("Walking.. Nay.. Nay..", outContent.toString().trim());
		outContent.reset();
		clownfish.fly(); 
        assertEquals("Flying.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
        clownfish.sing(); 
        assertEquals("Singing.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
    	clownfish.swim();
    	assertEquals("Splash.. Splash..", outContent.toString().trim());
        outContent.reset();
		clownfish.colour();
		assertEquals("I am orange", outContent.toString().trim());
        outContent.reset();
		clownfish.eat();
		assertEquals("No !! I dont eat other fishes", outContent.toString().trim());
        outContent.reset();
		clownfish.joke();
		assertEquals("I have some sense of humor. Comes from my name", outContent.toString().trim());
        outContent.reset();
    }
	
	@Test
	public void validateDolphin() throws IOException {
		Animal dolphin = new Dolphin(); 
		dolphin.walk(); 
		assertEquals("Walking.. Nay.. Nay..", outContent.toString().trim());
		outContent.reset();
		dolphin.fly(); 
        assertEquals("Flying.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
        dolphin.sing(); 
        assertEquals("Singing.. Nay.. Nay..", outContent.toString().trim());
        outContent.reset();
    	dolphin.swim();
    	assertEquals("Splash.. Splash..", outContent.toString().trim());
        outContent.reset();
    }
}
