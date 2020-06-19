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
	public boolean walk() {
		if(isCaterpillar) {
			System.out.println("Baby la.. Crawling..");
		}else {
			System.out.println("Walking.. Nay.. Nay..");
		}
		return false;
	}

	@Override
	public boolean fly() {
		if(isCaterpillar) {
			System.out.println("Flying.. Nay.. Nay..");
			return false;
		}else {
			System.out.println("I am flying");
			return true;
		}
	}

	@Override
	public boolean sing() {
		System.out.println("Singing.. Nay.. Nay..");
		return false;
	}

	public boolean isCaterpillar() {
		return isCaterpillar;
	}

	public void setCaterpillar(boolean isCaterpillar) {
		this.isCaterpillar = isCaterpillar;
	}

	@Override
	public boolean swim() {
		System.out.println("Swimming.. Nay.. Nay..");
		return false;
	}

}
