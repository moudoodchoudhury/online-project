package com.encapsulation;

public class EncapsulationC {
	
	private String name ="helen" ;
	private String sex="female";
	
	private int age;
	private int st;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSt() {
		return st;
	}
	public void setSt(int st) {
		this.st = st;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	
public static void main(String[] args) {
	EncapsulationC en =new EncapsulationC();
	System.out.println("her name is "+en.getName());
	System.out.println("her sex is "+ en.getSex());
	en.setAge(90);
	en.setSt(75);
	System.out.println("her age is "+en.getAge());
	System.out.println("her st number is"+en.getSt());
}
}
