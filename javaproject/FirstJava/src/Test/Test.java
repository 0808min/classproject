package Test;

public class Test {
	
	public static void main(String[] args) {
		
		int year = 2008;		// 태어난 년도
				
		int age = 15; // 회원의 나이
		boolean chk = age >= 15 && age <= 65;
		
		// chk = 상태값(논리값 : 조건식) ? true : false;
		chk = age>15 ? true : false;
		
		System.out.println("태어난 년도 : " + year);
		
		System.out.println("나이 : " + age);
		
		String msg = age>15 ? "무료접종 대상자입니다." : "무료접종 대상자가 아닙니다.";
		System.out.println(msg);
		
	
	}
		
	
}
		

