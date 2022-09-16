package Test;

public class Test {
	
	public static void main(String[] args) {
		
		int year = 2009;		
				// 청소년 13~19
		int age = 14;
		
		boolean chk = age >= 14 && age <= 65;
		
		int score = 14;
		
		
		System.out.println("태어난 년도 : " + year);
		
		System.out.println("대상자 판별 : " + chk);
		
		if (score <= 14) {
			System.out.println("접종 대상자 입니다.");
			
		} else {
		
			System.out.println("접종 대상자가 아닙니다.");
		}
		
	
			
		
		
		
	} 
		

}
