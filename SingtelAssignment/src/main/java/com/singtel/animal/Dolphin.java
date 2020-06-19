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
	public void walk() {
		fish.walk();
	}

	@Override
	public void fly() {
		fish.fly();
	}

	@Override
	public void sing() {
		fish.sing();
	}

	public void swim() {
		fish.swim();
	}

}
