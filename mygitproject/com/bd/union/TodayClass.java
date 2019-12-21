package com.bd.union;

public class TodayClass {
	
	void voidmethod() {
		
		int salary = 2000;
		int bonus= 200;
		int total =salary+bonus;
		System.out.println("my total salary"+total);
		
	}
	
	 String ReturnMethod() {
		
		String name1= "smart";
		String name2= "tech";
		String result =name1+name2;
		return result;
		
	}
	
	String parameter(String name1, String address1){
        String result= name1+address1;
		return result;
		
		
	}
	
	static void staticmethod() {
		
		String hobby1="yo yo";
		String hobby2="cricket";
		String mainhobby=hobby1+" and "+hobby2;
	System.out.println("my hobbies are"+" "+mainhobby);
		
		
		
	}

public static void main(String[] args) {
     TodayClass obj= new TodayClass();
	obj.voidmethod();
	System.out.println(obj.ReturnMethod());
	System.out.println(obj.parameter("moudood", "glendale"));
	TodayClass.staticmethod();

	
}
}
