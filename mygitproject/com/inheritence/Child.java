package com.inheritence;

public class Child  extends Parents{
	void our_child() {
		
		System.out.println(" I am from child class properties");
	}
	public static void main(String[] args) {
		
		Child ch =new Child();
		ch.our_child();
		ch.our_grandparents();
		ch.our_parents();
		ch.getName();
	}

}
