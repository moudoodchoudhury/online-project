package com.bd.union;

public class ParentClass{
	
	 public void cricketer() {
		
		String name="tamim hit today";
		int score =50;
		String tamim_score= name+" "+ score +" " +"runs" ;
		
		System.out.println(tamim_score);
		
	}
	 int age() {
		 
		 int rahim_age=30;
		 int karim_age=30;
		 int samad_age=30;
		 int total_age=rahim_age+karim_age+samad_age;
		return total_age;
	 }
	 
	 int price(int potato, int rice) {
		int total_price=potato+rice;
		return total_price;
			
		}
	 
	 void parametermethod(String first_name, String last_name) {
		 String full_name= first_name+" "+last_name;
		 System.out.println(full_name);
		 
	 }
	private int parametermethod1(int c,int d) {
		 int total1= c+d;
		return total1;
		 
	 }
		 
		static void names() {
			
			String first_name= "abdul";
			String second_name="samad";
			String all_name = first_name+" "+"and"+" "+second_name;
			System.out.println(all_name);
		}
		
		protected static String protectedourname(String one, String two) {
			String totalname= one + two;
			return totalname;
			
			
		}
	 
	/* public static void main(String[] args) {
		
		ThirdProject ch=new ThirdProject();
		ch.cricketer();
		System.out.println(ch.age());
		System.out.println(ch.price(90, 70));
		ThirdProject.names();
		ch.parametermethod("abdus", "samad");
		System.out.println(ch.parametermethod1(35,45));
		System.out.println(ch.ourname("abdul", "rahman"));
		
		
	}*/

}
