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
	public void fly() {
		System.out.println("Flying.. Nay.. Nay..");
	}

	@Override
	public void sing() {
		System.out.println("Meow");
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void swim() {
		System.out.println("Swimming.. Not so much..");
	}

}
