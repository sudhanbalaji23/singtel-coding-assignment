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
	public boolean walk() {
		System.out.println("Walking.. Nay.. Nay..");
		return false;
	}

	@Override
	public boolean fly() {
		System.out.println("Flying.. Nay.. Nay..");
		return false;
	}

	@Override
	public boolean sing() {
		System.out.println("Singing.. Nay.. Nay..");
		return false;
	}

	public boolean swim() {
		System.out.println("Splash.. Splash..");
		return true;
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
