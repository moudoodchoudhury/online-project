package com.inheritence;

public class Parents extends GrandParent {
	
	void our_parents() {
		
		System.out.println("I am from parents class properties");
	}
	public static void main(String[] args) {
		
		Parents pr =new Parents();
		pr.our_parents();
		pr.our_grandparents();
	
		
		
		GrandParent gp = new  GrandParent();
		gp.our_grandparents();
	
	}

}
