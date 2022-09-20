package chapter05.Exam;

public class Member2 {

	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
//	생일표현 : 문자열? 정수? : 19990101 20020101
	private int birthday;
	private String address;

//    생성자
	public Member2(String name, String phoneNumber, String major, int grade, String email, int birthday,
			String address) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	public Member2(String name, String phoneNumber, String major, int grade, String email) {

		this(name, phoneNumber, major, grade, email, 0, null);

//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.major = major;
//		this.grade = grade;
//		this.email = email;
//		this.birthday = birthday;
//		this.address = address;
	}

//	메소드
	public void showMember2Info() {
		System.out.println("회원정보 ==================");
		System.out.println("이름 : " + this.name);
		System.out.println("전화 : " + this.phoneNumber);
		System.out.println("전공 : " + this.major);
		System.out.println("학년 : " + this.grade);
		System.out.println("메일 : " + this.email);
		System.out.println("생일 : " + (this.birthday==0 ? "미입력" : this.birthday));
		System.out.println("주소 : " + (this.address==null ? "미입력" : this.address));
		
	}
	

}
