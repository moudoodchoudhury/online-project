package com.bd.union;

public class ChildClass extends ParentClass {
	
	String getName() {
		
		String name="smarttech";
		int address=345;
		String value= name+address;
		return value;
		
	}
	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		System.out.println(obj.getName());
		System.out.println(obj.protectedourname("BSUL", "Kahar"));
		
		
		
		
		


	}

}

