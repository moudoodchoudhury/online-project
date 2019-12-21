package com.usa.reversestring;

public class PracticeReverseSrtring {
	
	public static void main(String[] args) {
		
	
	String name ="moudood";
	
	String city ="Mymensingh";
	
	String teacher ="abdul hye";
	
	String school ="shaheen";
	
	String myson="Iraj Choudhury";
	
	String mybrother ="Maruf Chowdhury";
	
	StringBuffer pn =new StringBuffer(name);
	System.out.println(pn.reverse());
	
	StringBuffer cd =new StringBuffer(city);
	System.out.println(cd.reverse());
	
	StringBuffer bd= new StringBuffer(teacher);
	System.out.println(bd.reverse());
	
	StringBuffer g= new StringBuffer(school);
	System.out.println(g.reverse());
	
	StringBuffer h= new StringBuffer(myson);
	System.out.println(h.reverse());
	
	StringBuffer v= new StringBuffer(mybrother);
	System.out.println(v.reverse());

}
}
