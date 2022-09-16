package chapter04exam;

import java.util.Calendar;
import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.println("출생 년도를 입력해주세요.>>> ");
			
			int year = in.nextInt();
			
			if(year==0)
				return; //메소드의 종료, 반환
			
			
			
			
			System.out.println();
			System.out.println("조회결과");
			System.out.println("--------");
			checkVaccine(year);
			System.out.println("----------");
			System.out.println();
		}
		
	}
	
		
		
	

	}
    public static void checkMedical(int birthYear) {
		
		// 올해년도
		int curYear = Calendar.getInstance().get(Calendar.YEAR);
		
		int age = curYear - birthYear + 1;
		System.out.println("나이 : " + 1);
		
		if(age>=20) {
			
			if(curYear%2 == birthYear%2) {
				System.out.println("무료 검진이 가능합니다.");
				
				if(age>=40) {
					System.out.println("암 검사도 무료로 진행합니다.");
				}
			} else {
				System.out.println("무료 검진이 불가능합니다.");
			}
				
			
		} else {
			System.out.println("20세 미만은 무료 검진 대상이 아닙니다.");
		}
		
//	 독감예방 접종이 가능한지 여부를 확인하는 메소드를 정의합니다.
//	 - 매개변수로 태어난 해(년도)를 전달받습니다.
//	 - 15세 미만의 경우와 65세 이상의 경우 “무료예방접종이 가능합니다.” 메시지가 콘솔에 출력하도록 합니다.
//	 - 위에서 정의한 조건의 범위가 아닌 나머지의 경우 “무료접종 대상이 아닙니다.”라고 출력하도록 합니다.
	
	public static void checkVaccine(int brithYear) {
		
		// 올해년도
		
		int currYear = Calendar.getInstance().get(Calendar.Year)
		
	
		// 나이 계산
		int age = currYear - brithYear + 1;	
		
		System.out.println("나이 : " + age);
		
		if(age<15 || age>=65) {
			System.out.println("무료 예방접종이 가능합니다.");
		} else {
			System.out.println("무료 접종 대상이 아닙니다.");
		}
	
	}

}
