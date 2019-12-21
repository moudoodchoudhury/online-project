package com.inheritence;

public class ChildClass implements ParentsA, ParentsB {
	
		


	public void getproperty() {
		System.out.println("I am from ParentsA");
		
	}


	public void getcash() {
		System.out.println("I am from ParentsB");
		
	}

	public static void main(String[] args) {
		ChildClass ob= new ChildClass();
		ob.getcash();
		ob.getproperty();
		
		
		
	}

}
