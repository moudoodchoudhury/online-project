package com.bd.union;

public class BananaRepublic extends GapFactory {

	void ladies_shirt() {
		String Brand_name="Banana Republic";
		String size ="M";
		System.out.println("I like"+" "+Brand_name +" "+ " "+"and"+" "+"my preferred size is"+" "+size);
		
	}
	
	public static void main(String[] args) {
		BananaRepublic lad = new BananaRepublic();
		lad.ladies_shirt();
		lad.apparel();
		System.out.println(lad.apparel_bottom());
		System.out.println(lad.total_pant_size(12, 12));
		System.out.println(lad.coat("diesel", "XL"));
		lad.shirt_size();
	}

}
