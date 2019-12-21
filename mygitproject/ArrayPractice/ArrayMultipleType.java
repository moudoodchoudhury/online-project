package ArrayPractice;

import java.util.Arrays;

public class ArrayMultipleType {

	public static void main(String[] args) {

		String month[] = { "january", "fenruary", "march", "april" };

		System.out.println("process 1 starts");
		for (int x = 0; x < month.length; x++) {
			System.out.println(month[x]);

		}
		System.out.println("process 2 starts");

		System.out.println(Arrays.toString(month));

		System.out.println("process 2 ends");

		System.out.println("process 3 starts");
		for (String mon : month) {
			System.out.println(mon);

			System.out.println("process 3 ends");
		}
		
		int age []= {25,30,35,40,50};
		
		for (int obj:age) {
			System.out.println(obj);
		}
		System.out.println(Arrays.toString(age));
		
		for (int x1=0;x1<age.length;x1++) {
			System.out.println(age[x1]);
		}
		
		String street_name[]= {"calvin rd","harlem rd","dahil rd","prutons rd"};
		
		for (String st:street_name) {
			System.out.println(st);
		}
		
		for (int x=0;x<street_name.length; x++) {
			System.out.println(street_name[x]);
		}
		
		System.out.println(Arrays.toString(street_name));
		
		

	}
}
