package com.usa.constuctor;

public class MyReverseInterger {
	
	public static void main(String[] args) {
		
		String abav = "abdul ahad";
		
		int a =26474488;
		
		int b= 6796859;
		
		int c=48488485;
		
		StringBuffer ob= new StringBuffer(abav);
		System.out.println(ob.reverse());
		
		System.out.println(new StringBuffer(String.valueOf(c)).reverse());
		
		System.out.println(new StringBuffer(String.valueOf(b)).reverse());
		
		System.out.println(new StringBuffer(String.valueOf(a)).reverse());
	}

}
