package com.encapsulation;

public class PracticeEncapsulation {
	
	private int age;
	private String gender;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		PracticeEncapsulation pr= new PracticeEncapsulation();
		
		pr.setAge(14);
		pr.setGender("male");
	

		System.out.println("My age is" +" "+pr.getAge() +" "+"Years");
		System.out.println("I am a "+pr.getGender());
		
	}

}
