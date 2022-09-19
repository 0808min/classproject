package chapter05.Exam;


public class Member {
//	① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	String name;
	String Pn;
	String maj;
	 lv;
	String email;
	String birthD;
	String address; 
	
//	② 위에서 정의한 정보를 출력하는 메소드 정의
	Member() {
		
	}
	
	Member(String name, String Pn, String maj, int lv, String email, String birthD, String address) {
		this.name = name;
		this.Pn = Pn;
		this.maj = maj;
		this.lv = lv;
		this.email = email;
		this.birthD = birthD;
		this.address = address;
		
	
		
	}
	
	Member(String name, String Pn, String maj, int lv, String email) {
		this(name, Pn, maj, lv, email,null,null);
	}
void Member() {
	
	System.out.println("이름 : " + name + "입니다.");
	System.out.println("전화번호 : " + Pn + "입니다.");
	System.out.println("학과 : " + maj + "입니다.");
	System.out.println("학년 : " + lv + "입니다.");
	System.out.println("이메일 : " + email + "입니다.");

	

	
if (birthD!= null && address!= null) {
	System.out.println("주소는 : " + address + " 입니다");
	System.out.println("생일은 : " + birthD + " 입니다");
	
//	③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
//	④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
	
	
	
	
	
		
		
		
		
}
		
}	

}
