package Test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		 // 더하기 add 뺴기 substract 곱하기 multifly 나누기 divide 둘레 circum 넓이 area
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 1을 입력해주세요.>>> ");
		int num1 = in.nextInt();
		
		System.out.println();
		
		System.out.println("숫자 2를 입력해주세요.>>> ");
		int num2 = in.nextInt();
		System.out.println("사칙연산 결과   ====");
		addResltPrint(num2, num2);
		substractResltPrint(num1, num2);
		multiFlyResltPrint(num1, num2);
		divideResltPrint(num1, num2);
		
		
		System.out.println("원의 반지름을 입력해주세요.>>> ");
		double rad = in.nextDouble();
		
        System.out.println();
		
		System.out.println("원의 둘레 : " + circum(rad));
		System.out.println("원의 넓이 : " + area(rad));
	}
	
	public static void addResltPrint(long num1, long num2) {
		
		System.out.println("덧셈결과 : " + (num1 + num2));
		
		
	
	
		
	}
	public static void substractResltPrint(long num1, long num2) {
		System.out.println("뺼셈결과 : " + (num1 - num2));
	}
	public static void multiFlyResltPrint(long num1, long num2) {
		System.out.println("곱셈결과 : " + (num1 * num2));
	}
	public static void divideResltPrint(double num1, double num2) {
		System.out.println("나눗셈결과 : " + (num1 / num2)); 
			
		
	}
	public static double circum(double r) {
		return 2 * 3.14 * r ;
	}
	public static double area(double r) {
		return 3.14 * r * r ;
	}
		
	


}
