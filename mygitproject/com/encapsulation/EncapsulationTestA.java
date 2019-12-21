package com.encapsulation;

public class EncapsulationTestA {
// part of oops concept
	// wrapping of variable and method into a unit
	//implement through getter and setter method
	//can be accomplish within one or another class
	private String role="Selenium automation engineer";
	private int salary=10000;
	
	private int age;

	public String getRole() {
		return role;
	}

	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	/*public String getRole() {
		return role;
	}
	public int getSalary() {
		return salary;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}*/
	

	
}



