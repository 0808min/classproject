package chapter07;

public class SmartPhone extends Phone {

//	하위클래스 : 상위클래스 멤버 + 새로운 맴버 정의

	Strirg model;

	SmartPhone() {
		super("010-1111-3333");
		this.model = "IOS";
	}

	SmartPhone(String phoneNumber) {
		super(phoneNumber);
		this.model = "android";

	}

	SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = "model";
	}

	void play() {
		System.out.println("app을 실행합니다.");
	}

	public static void main(String[] args) {

//		SmartPhone sp = new SmartPhone();

		SmartPhone sp = new SmartPhone("010-4444-4444, google");

		System.out.println(sp.phoneNumber);
		sp.call();

		System.out.println(sp.model);
		sp.model();

	}

}
