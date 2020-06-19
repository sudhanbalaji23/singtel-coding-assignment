/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */
public class RoosterAlternate {

	Chicken chicken; 
	
	public RoosterAlternate() {
		chicken = new Chicken();
	}
	
	public void walk() {
		chicken.walk();
	}

	public void fly() {
		chicken.fly();
	}

	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
	
}
