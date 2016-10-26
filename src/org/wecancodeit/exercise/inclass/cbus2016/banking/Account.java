package org.wecancodeit.exercise.inclass.cbus2016.banking;

/**
 * This is the superclass. Things here are shared by subclasses.
 * 
 * @author WeCanCodeIT
 * 
 */
public class Account {

	private String name;
	protected int balance;

	public Account(String newName, int newBalance) {
		name = newName;
		balance = newBalance;
	}
	
	public int getBalance() {
		return balance;
	}

	public String getName() {
		return null;
	}

}