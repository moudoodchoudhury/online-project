package com.bd.union;

public class Parents extends GrandParents {
	
	 static void parents( String age) {
		
		 System.out.println("My father's age is" + age +"years");
		
	}
	 
	 public static void main(String[] args) {
		
		System.out.println(MyGrandParent());
		parents("50");
	}
	

}
