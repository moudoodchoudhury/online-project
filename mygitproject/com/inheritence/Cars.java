package com.inheritence;

public class Cars implements TeslaCar,ToyotaCar{

	
	public void feature_Toyota() {
		
		System.out.println("Toyota is a hydbrid car");
		
	}


	public String speed_Toyota(String speed, String milage) {
		String speed_feature= "speed is"+speed +"and" +"milage is"+milage;
		return speed_feature;
	}


	public void battery_Toyota() {
    System.out.println("Toyota is a battery run car");
		
	}


	public void feature_tesla() {
		System.out.println("Tesla is a electric car");
	
		
	}


	public String speed_tesla(String speed, String milage) {
		String speed_feature= "speed is"+speed +"and" +"milage is"+milage;
		return speed_feature;
	}

	
	public void battery_tesla() {
		
		System.out.println(" Tesla need to be charged electrically");
	}
	public static void main(String[] args) {
		
		Cars car=new Cars();
		car.feature_Toyota();
		System.out.println(car.speed_Toyota("45", "56"));
		car.battery_Toyota();
		car.feature_tesla();
		car.battery_tesla();
		System.out.println(car.speed_tesla("55", "100"));
		System.out.println(TeslaCar.rating_tesla);
		
		
		
		
	}
	

	
	
	
	
	
	

}
