package Test;

import java.util.Calendar;

public class Test3 {
	
	public static void main(String[] args) {
		
		int year = in.nextInt();
		
		checkVaccine(year);
	}
	
	public static void checkVaccine(int birthYear) {
		
		int currYear = Calendar.getInstance().get(Calendar.YEAR);
		
		int age = currYear - birthYear + 1;
		System.out.println("나이 : " + age);
		
		if (age >= 20) {
			if (currYear % 2 == birthYear % 2) {
				System.out.println("무료 검진이 가능합니다.");
			}
		}

		
	}
	
	
}
