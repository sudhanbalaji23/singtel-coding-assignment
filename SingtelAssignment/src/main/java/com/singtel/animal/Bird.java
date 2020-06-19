/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */
public class Bird implements Animal {

	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("La.. La.. La..");
	}

	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void swim() {
		System.out.println("Nay.. Cant swim");
	}

}
