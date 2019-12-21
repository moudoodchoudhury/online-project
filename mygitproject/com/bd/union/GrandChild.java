package com.bd.union;

public class GrandChild extends ChildClass  {
	
	int method() {
		
		int a =19;
		int b=30;
		int total1=a+b;
		return total1;
		
	}
	
	public static void main(String[] args) {
	
		GrandChild obc= new GrandChild(); 
		System.out.println(obc.getName());
		System.out.println(obc.price(14, 25));
		System.out.println(obc.method());
		
		ChildClass obj= new ChildClass();
		
		
		
	}

	
	
}
