package com.polymorphism;

public class overloading {

	static void classA(int a, int b) {

		System.out.println(a + b);
	}

	void classA(String age, String gender) {

		System.out.println("My age is" + " " + age +" "+ "and" + " " + "My gender is" + " " + gender);

	}

	public static void main(String[] args) {
		overloading ob = new overloading();
		ob.classA(10, 20);
		ob.classA("40", "male");
	
	}

}
