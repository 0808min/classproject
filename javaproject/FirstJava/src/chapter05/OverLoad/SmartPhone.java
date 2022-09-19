package chapter05.OverLoad;

public class SmartPhone {
	
//	스마트폰 인스턴스를 만들기위한 설계도 역할
	
	// 클래스는 변수와 메소드로 구성한다.
	// 생성자 : 필수이지만 생략 가능.
	
	// 클래스의 맴버 : 변수, 메소드
	// 클래스 내부에 정의된 변수 : 맴버 변수, 인스턴스 변수
	// 클래스 내부에 정의된 메소드 : 멤버 메소드, 인스턴스 메소드
	
	// 스마트폰의 속성 : 컬러, 사이즈, 재조사, 볼륨 사이즈
	// 속성 => 변수
	
	String color; // 인스턴스 변수, 초기화 생략 가능 = 인스턴스 생성시에 초기값으로 할당
	float size;  // 0.0
	String company; // null
	int volumeSize;  // 0
	
//	생성자 : 인스턴스 생성시에 단 한번 실행하는 초기화 메소드
//	클래스이름 (매개변수....){
//	초기화 코드	
//	}
	SmartPhone() {
//		매개변수가 없고, 처리 내용이 없는 생성자 => 기본생성, 생략가능
}

//		생성자의 오버로딩 : 같은 이름에 생성자를 정의
		
		SmartPhone(String color, float size, String company, int volumeSize) {
			
			//인스턴스를 생성하면 this 참조변수도 생성
			//this는 
			this.color = color;
			this.size = size;
			this.company = company;
			this.volumeSize = volumeSize;

	}
		
	SmartPhone(String company, float size) {
		this.company = company;
		this.size = size;
		
	}
	


	
	SmartPhone(String company) {
//		this.color = color;
//		this.size = size;
//		this.company = company;
//		this.volumeSize = volumeSize;
		this("black", size, company, 10);
	}
	
	
	// 전화걸기
	void call() {
		System.out.println("전화걸기.");
		
	}
	// volume 키우기
	void volumeUp() {
		System.out.println("볼륨을 키웁니다.");
		volumeSize++;
	
	}
	// volume 낮추기 
	void volumeDown() {
		System.out.println("볼륨을 낮춥니다.");
		volumeSize--;
	}
	
	void showInfo() {
		System.out.println("폰정보");
		System.out.println("제조사 : " + company);
		System.out.println("색상 : " + this.color); // 인스턴스의 맴버를 가르키는 키워드 : this
		System.out.println("사이즈 : " + size);
		System.out.println("볼륨크기 : " + volumeSize);
	}
}




