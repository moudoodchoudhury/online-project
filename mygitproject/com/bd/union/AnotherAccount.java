package com.bd.union;

public class AnotherAccount extends CityBank {
	
	String second_acc() {
		String user_name ="roy";
		String password ="36474";
		String access= user_name + password;
		return access;
		
		
	}
	public static void main(String[] args) {
		
		AnotherAccount user = new AnotherAccount();
		System.out.println(user.another_Acc("moudood", "27747"));
		user.current_Acc();
		System.out.println(user.Saving_Acc());
		System.out.println(user.second_acc());
		
		
	}

}
