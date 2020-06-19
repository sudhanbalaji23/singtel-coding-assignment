package com.singtel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.singtel.animal.Bird;

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
		Bird bird = new Bird(); 
		bird.walk(); 
		assertEquals("I am walking", outContent.toString().trim());
		outContent.reset();
        bird.fly(); 
        assertEquals("I am flying", outContent.toString().trim());
        outContent.reset();
        bird.sing(); 
        assertEquals("La.. La.. La..", outContent.toString().trim());
    }
}
