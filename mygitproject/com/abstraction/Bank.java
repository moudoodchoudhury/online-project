package com.abstraction;

public abstract class Bank {
	
	abstract void bill();
	abstract void change(String change);
	
	void currency() {
		
		System.out.println("my preferred currency is taka");
	}
	

}
