package com.inheritence;

public class GrandParent {
	
	private String name = "Automation Enineer";
	private String salary = "My salary is a 10000";
	
	
	
	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}
	
	protected void our_grandparents() {
		
		System.out.println("I am from grandparents class");
	}
	
	public static void main(String[] args) {
		
		GrandParent ob =new GrandParent();
		ob.our_grandparents();
		System.out.println(ob.getName());
		System.out.println(ob.getSalary());
	}

}
 