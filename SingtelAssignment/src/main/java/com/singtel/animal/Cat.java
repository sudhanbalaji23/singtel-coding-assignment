/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */
public class Cat implements Animal{

	@Override
	public boolean fly() {
		System.out.println("Flying.. Nay.. Nay..");
		return false;
	}

	@Override
	public boolean sing() {
		System.out.println("Meow");
		return true;
	}

	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

	@Override
	public boolean swim() {
		System.out.println("Swimming.. Not so much..");
		return false;
	}

}
