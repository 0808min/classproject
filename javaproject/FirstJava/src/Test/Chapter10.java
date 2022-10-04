package Test;

import java.util.Scanner;

public class Chapter10 {

	public static void main(String[] args) {

//		throw new Exception("강제적 예외발생");
		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요. >> ");
		int score = sc.nextInt();

		while (true) {
			try {
				if (!(score >= 0 && score <= 100)) {
					throw new Exception("입력한 점수는 정상범위에 점수가 아닙니다.");
				}
				System.out.println("국어점수는 : " + score + "점 입니다.");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("다시 입력해주세요");
			}
		}
	}

}
