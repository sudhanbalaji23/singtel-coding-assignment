/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */
public class Bird implements Animal {

	public boolean fly() {
		System.out.println("I am flying");
		return true;
	}

	public boolean sing() {
		System.out.println("La.. La.. La..");
		return true;
	}

	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

	@Override
	public boolean swim() {
		System.out.println("Nay.. Cant swim");
		return false;
	}

}
