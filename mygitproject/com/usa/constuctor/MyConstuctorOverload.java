package com.usa.constuctor;

public class MyConstuctorOverload {
	
	public MyConstuctorOverload(int age, int call) {
		
		System.out.println("his age is "+age);
		System.out.println("we code number is " + call);
	}
	public MyConstuctorOverload(String name, int number) {
		System.out.println("his name is"+ name);
		System.out.println("his cell phone number is " + number);
	}
	
	public static void main(String[] args) {
		
		MyConstuctorOverload ob = new MyConstuctorOverload(78, 56);
		
		MyConstuctorOverload ob1= new MyConstuctorOverload("moudood",34);
	} 

}
