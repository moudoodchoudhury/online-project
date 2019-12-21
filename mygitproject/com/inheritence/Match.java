package com.inheritence;

public class Match implements Football, Cricket {


	public String my_play(String b) {
		return b;
	}


	public String my_game(String a) {
		
		return a;
	}
public static void main(String[] args) {
	Match mt = new Match();
System.out.println(mt.my_game("abdul"));
System.out.println(mt.my_play(" samad"));

	

		
	}
}


