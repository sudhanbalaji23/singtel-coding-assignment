/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */
public class Chicken extends Bird {

	public boolean fly() {
		System.out.println("Flying.. Nay.. Nay..");
		return false;
	}

	public boolean sing() {
		System.out.println("Cluck, cluck");
		return true;
	}

}
