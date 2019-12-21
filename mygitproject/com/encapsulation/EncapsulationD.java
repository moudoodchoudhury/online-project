package com.encapsulation;

public class EncapsulationD {
	
	
	public static void main(String[] args) {
		EncapsulationC d= new EncapsulationC();
		System.out.println(d.getName());
		System.out.println(d.getSex());
		
		
		d.setAge(45);
		d.setSt(56);
		
		System.out.println(d.getAge());
		System.out.println(d.getSt());
	}
	
	

}
