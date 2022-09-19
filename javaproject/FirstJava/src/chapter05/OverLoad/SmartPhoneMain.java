package chapter05.OverLoad;

public class SmartPhoneMain {
	
	public static void main(String[] args) {
		
	}
	
	// SmartPhone 인스턴스 생성
	SmartPhone sp1 = new SmartPhone("RED", 4.7f, "삼성", 5);
	// 인스턴스를 생성하면 this 참조변수도 생성
	sp1.showInfo(); 
	
	SmartPhone sp2 = new SmartPhone("GREEN", 6.9f, "애플", 7);
	
	sp2.showInfo(); 
	
	SmartPhone sp3 = new SmartPhone();
	
	SmartPhone sp4 = new SmartPhone("APPLE, 50f");
	
	sp4.showInfo(); 
	
	SmartPhone sp5 = new SmartPhone("Samsung");
	sp5.showInfo(); 

}
