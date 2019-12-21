package com.interfacepractice;

public class Child implements FatherProperty,MotherProperty {


	public void mother_property() {
		System.out.println("my mother got two houes");
		
	}

	public void mother_car() {
		System.out.println("My mother have nissan ");
		
	}

	public void mother_cash() {
		System.out.println("My mother got $40000 cash");
		
	}

	public void father_property() {
		System.out.println("my father got two houes");
	}

	public void father_car() {
		System.out.println("My mother have toyota ");
		
		
	}

	public void father_cash() {
		System.out.println("My mother got $50000 cash");
		
	}

	

	public static void main(String[] args) {
		Child ch = new Child();
		ch.father_car();
		ch.father_cash();
		ch.father_property();
		ch.mother_car();
		ch.mother_cash();
		ch.father_property();
		

}

	
	}
