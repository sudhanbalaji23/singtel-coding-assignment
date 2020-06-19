/**
 * 
 */
package com.singtel.animal;

/**
 * @author Sudhan Balaji
 *
 */
public class Butterfly implements Animal{

	boolean isCaterpillar = false;

	@Override
	public void walk() {
		if(isCaterpillar) {
			System.out.println("Baby la.. Crawling..");
		}else {
			System.out.println("Walking.. Nay.. Nay..");
		}
	}

	@Override
	public void fly() {
		if(isCaterpillar) {
			System.out.println("Flying.. Nay.. Nay..");
		}else {
			System.out.println("I am flying");
		}
	}

	@Override
	public void sing() {
		System.out.println("Singing.. Nay.. Nay..");
	}

	public boolean isCaterpillar() {
		return isCaterpillar;
	}

	public void setCaterpillar(boolean isCaterpillar) {
		this.isCaterpillar = isCaterpillar;
	}

	@Override
	public void swim() {
		System.out.println("Swimming.. Nay.. Nay..");
	}

}
