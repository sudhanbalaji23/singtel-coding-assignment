/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */

public class Duck extends Bird {

	public boolean sing() {
		System.out.println("Quack, quack");
		return true;
	}
	
	public boolean swim() {
		System.out.println("Splash.. Splash..");
		return true;
	}
}
