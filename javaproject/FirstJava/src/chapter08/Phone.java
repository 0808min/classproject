package chapter08;

public abstract class Phone {

	String phoneNumber;
	boolean power;

	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.power = false;
	}

	void call() {
		System.out.println("전화 걸기");
	}

//	추상 메소드로 정의
	abstract void turnOn();
}
