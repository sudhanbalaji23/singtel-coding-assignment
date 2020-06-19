/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */
public class Parrot extends Bird {

	Objects parrot;

	public Parrot(Objects object) {
		this.parrot = object;
	}

	public void sing() {
		this.parrot.sing();
	}
}
