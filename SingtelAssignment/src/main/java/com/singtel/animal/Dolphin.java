/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */
public class Dolphin implements Animal{

	Fish fish = new Fish();

	@Override
	public boolean walk() {
		return fish.walk();
	}

	@Override
	public boolean fly() {
		return fish.fly();
	}

	@Override
	public boolean sing() {
		return fish.sing();
	}

	public boolean swim() {
		return fish.swim();
	}

}
