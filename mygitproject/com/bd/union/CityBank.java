package com.bd.union;

public class CityBank {
	
	public void current_Acc() {
		String Acc_Name= "Mithun";
		String Acc_number= "683834905";
		String My_Account= Acc_Name+ " "+ Acc_number;	
		System.out.println(My_Account);		
	}
	protected String Saving_Acc() {
		String name1= "Akher";
		String acc_feature ="I can save my money here";
		String acc_details=name1+acc_feature;
		return acc_details;		
		
	}
	public String another_Acc(String a, String b) {
		String account= a +" "+  b;
		return account;
		
	}
	public static void main(String[] args) {
	
		CityBank bnk = new CityBank();
		bnk.current_Acc();
		System.out.println(bnk.Saving_Acc());
		System.out.println(bnk.another_Acc("Q:what's the best feature of city bank?", "Ans: Customer service"));
	}
	
	

}
