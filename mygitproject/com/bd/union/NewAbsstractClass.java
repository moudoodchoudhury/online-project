package com.bd.union;

public class NewAbsstractClass extends AbstractClass {

	void MysecondClass() {
	int a =123;
	int b= 456;
	int c= a+b;
	
	System.out.println(c);
		
		
	}
	public static void main(String[] args) {
		NewAbsstractClass obj = new NewAbsstractClass();
		obj.MysecondClass();
		obj.MyAbstractClass();
	}

}
