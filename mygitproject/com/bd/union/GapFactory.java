package com.bd.union;

public class GapFactory {
	
	
	public void apparel() {
		String garment=" shirt";
		String price= "$45";
		String Want_to_buy= "I want to buy"+" "+garment+"@"+" "+price;
		System.out.println(Want_to_buy);
	
	}
	
	public String apparel_bottom() {
		String my_choice_pant= "jeans";
		String value="Tk. 400";
		String mySecondChoice="my second choice is"+" "+my_choice_pant+value;
		return mySecondChoice ;	
	
	}
	
	private int apparel_size(int a) {
		 int pant_size= a;
		return pant_size;
		
	}
	protected int total_pant_size(int a,int b) {
		 int pant_size= a;
		 int pant_length=b;
		 int total_shape=a*b;
		return total_shape;
		
	}
	public static void shirt_size() {
		String collar="24 inch";
		String chest ="35 inch";
		String total_size= collar +" "+chest;
		System.out.println(total_size);
	}
	
	public static String coat(String coat_name,String coat_size) {
		String my_coat=coat_name +" "+coat_size;
		return my_coat;
		
	}
	void pant_of_choice() {
		
		System.out.println("I like Gap");
		System.out.println("Size of my pant is 36");
		
	}
	public static void main(String[] args) {
		GapFactory app= new GapFactory();
		app.apparel();
		System.out.println(app.apparel_bottom());
		System.out.println(app.apparel_size(24)+" "+"inch");
		System.out.println(app.total_pant_size(20, 15)+" "+"inch");
		GapFactory.shirt_size();
		System.out.println(GapFactory.coat("CK", "25 inch"));
		app.pant_of_choice();
	}

}
