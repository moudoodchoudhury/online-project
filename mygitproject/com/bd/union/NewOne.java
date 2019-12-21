package com.bd.union;

public class NewOne {
	String name1;
	String name2;
	String fullname;
	int a;
	int b;
	int salary;
	int bonus;
	int total;
	int update;
	char currency;
	
	void name() {
		
		name1="azizul";
		name2="sadrul";
        fullname=name1+name2;
		
		
	}
	
	int benifit(){
	salary=9000;
	bonus = 6000;
    return total=salary+bonus;
	}
	 
     void latest( int a, int b){
		a=35;
		b=60;
		update=a+b;
	}
     static void income() {
    	int  a=300;
    	int  b=400;
    	int total =a+b;
    	System.out.println(total);
    	  
    	  
    	 
    	 
     }
public static void main(String[] args) {
	
	NewOne obj = new NewOne();
	obj.name();;
	obj.benifit();
	System.out.println(obj.total);


    obj.latest(35, 60);
	System.out.println(obj.fullname);
	
	System.out.println("this is my total benifit"+ obj.benifit());
	System.out.println(obj.update);
	income();
	
	
	

	
	
	

}
}
