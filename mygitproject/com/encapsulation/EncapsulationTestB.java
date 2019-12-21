package com.encapsulation;

public class EncapsulationTestB {

	public static void main(String[] args) {

		EncapsulationTestA obj = new EncapsulationTestA();
		obj.setAge(70);
		System.out.println(obj.getSalary());
		System.out.println(obj.getRole());
		System.out.println(obj.getAge());

	}

}
