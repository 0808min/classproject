package chapter05.Exam;

import chapter05.SmartPhone;

public class MemberMain {

	public static void main(String[] args) {
		
		
		
		
		Member sp1 = new Member("박민", "01075471556", "패션", "4", "min0808mini@naver.com", "910808","서울시"));
		Member sp2 = new Member("민", "01075471554");
		
		sp1.showInfo();
		System.out.println("--------------------");
		sp2.showInfo();
	



	}

}
