package com.bd.union;

public class MethodTest {


static String myName; // class level or global label, static can be written any where 
double Salary; // instance variable
double Bonus;
double upDate;
int credit;
// ctrl+shift+F to organize the codes 
// Methods need to be clear, consistent and testable 

void getName() { // this is void method, return nothing
int a = 10; // a is local variable
int b = 20;
int c= a+b;
System.out.println("My total value is:"+c); // on void method full function has to be finished inside the method

}

double getSalary() { // this is a return or non void method
//return Salary; // return is the key word
Salary = 8000;
Bonus = 2500;
return upDate = Salary + Bonus;

}

void getUpdate(double upDate) { // this is a parameter method, arguments are data type and could
// be as many as needed

}

int getCredit() {
return credit;

}

String student() {
return null;
}

static void getBonus() { // static method

}
public static void main(String[] args) {
//MethodTest obj = new MethodTest();
//String ob = new String(); // string is a special class that can create object / obj can't be use twice
//obj.getName();
// static abcd = new static(); string can create object due to special class
MethodTest obj = new MethodTest();
obj.getSalary();
System.out.println("total "+obj.getSalary());
}
}
