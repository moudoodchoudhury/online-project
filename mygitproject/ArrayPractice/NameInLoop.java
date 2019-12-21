package ArrayPractice;

public class NameInLoop {
	public static void main(String[] args) {
		
		String SmarttechClass_Student[]=new String[4];
		
		SmarttechClass_Student[0]="akher";
		SmarttechClass_Student[1]="moudood";
		SmarttechClass_Student[2]="mithun";
		SmarttechClass_Student[3]="roy";
		
		System.out.println("total length of array" +SmarttechClass_Student.length);
		System.out.println("the fourth student's name is"+SmarttechClass_Student[3]);
		
		System.out.println("the name of the smarttech student's are :");
		for(int a=0;a<SmarttechClass_Student.length;a++) {
			System.out.println(SmarttechClass_Student[a]);
		}
		
				
	}

}
