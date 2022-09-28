package chapter09.exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person4Main {
	
	public static void main(String[] args) {
		
		LocalDate brithDay = LocalDate.of(1991, 8, 8);
		LocalDate now = LocalDate.now();
		
		long days = ChronoUnit.MONTHS.between(brithDay, now);
		System.out.println(days);
		
	}

}
