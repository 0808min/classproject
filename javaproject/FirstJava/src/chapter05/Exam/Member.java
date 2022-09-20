package chapter05.Exam;

public class Member {

//	① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	String name;
	String phoneNumber;
	String major;
	String level;
	String email;
	String birthDay;
	String address;

//	② 위에서 정의한 정보를 출력하는 메소드 정의

	Member(String name, String phoneNumber, String major, String level, String email, String birthDay, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.level = level;
		this.email = email;
		this.birthDay = birthDay;
		this.address = address;

	}

	Member(String name, String phoneNumber, String major, String level, String email) {
		this(name, phoneNumber, major, level, email, null, null);
	}

	void showInfo() {

		System.out.println("이름 : " + name + "입니다.");
		System.out.println("전화번호 : " + phoneNumber + "입니다.");
		System.out.println("학과 : " + major + "입니다.");
		System.out.println("학년 : " + level + "입니다.");
		System.out.println("이메일 : " + email + "입니다.");
		System.out.println("주소 : " + address + "입니다.");

//	③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의

//	④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력

	}

}
