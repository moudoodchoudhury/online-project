package com.abstraction;

public class MoneyExchange extends Bank {


	void bill() {
		System.out.println("dollars");
		
	}
	public static void main(String[] args) {
		MoneyExchange mn =new MoneyExchange();
		mn.bill();
		mn.currency();
		mn.change("cents");
		
	}

	void change(String change) {
	System.out.println(change);
		
	}

}
