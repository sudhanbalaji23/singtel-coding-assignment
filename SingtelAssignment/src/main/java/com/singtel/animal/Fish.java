/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */
public class Fish implements Animal {

	@Override
	public void walk() {
		System.out.println("Walking.. Nay.. Nay..");
	}

	@Override
	public void fly() {
		System.out.println("Flying.. Nay.. Nay..");
	}

	@Override
	public void sing() {
		System.out.println("Singing.. Nay.. Nay..");
	}

	public void swim() {
		System.out.println("Splash.. Splash..");
	}
	
	public void size() {
		System.out.println("Dont know la. Name the fish");
	}

	public void colour() {
		System.out.println("Dont know la. Name the fish");
	}

	public void eat() {
		System.out.println("Dont know la. Name the fish");
	}

	public void joke() {
		System.out.println("Dont know la. Name the fish");
	}
}
