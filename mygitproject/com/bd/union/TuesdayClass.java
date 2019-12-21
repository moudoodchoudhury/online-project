package com.bd.union;

public class TuesdayClass {
	
	String parametermethod(String name, String run) {	
		String score= name +" " +run;
		return score;
		
		
	}
	public static void main(String[] args) {
		TuesdayClass cric = new TuesdayClass();
		System.out.println(cric.parametermethod("tamim", "score 50 runs"));
	}

}
