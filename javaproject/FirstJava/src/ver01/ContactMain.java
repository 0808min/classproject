package ver01;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {

//		실행 과정 
//		 main()메소드를 정의합니다.
//		 연락처 데이터를 저장하는 인스턴스를 생성합니다.
//		 변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력합니다.
//		 생성된 인스턴스의 정보 출력 메소드를 호출합니다.
//		 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다.
//		 인스턴스의 출력메소드를 다시 실행합니다

		Contact data = new Contact();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("이름을 입력해 주세요 >> ");
			data.setName(sc.nextLine());

			System.out.print("전화번호를 입력해 주세요 >> ");
			data.setPhoneNumber(sc.nextLine());

			System.out.print("이메일을 입력해 주세요 >> ");
			data.setEmail(sc.nextLine());

			System.out.print("주소를 입력해 주세요 >> ");
			data.setAddress(sc.nextLine());

			System.out.print("생일을 입력해 주세요 >> ");
			data.setBirthday(sc.nextLine());

			System.out.print("그룹을 입력해 주세요 >> ");
			data.setGroup(sc.nextLine());

			data.tell();

			System.out.print("계속 진행 1, 종료 0 입력해주세요 >>>");

			if (Integer.parseInt(sc.nextLine()) == 0) {
				sc.close();
				break;
			}

		}

	}

}
