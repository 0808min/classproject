package chapter08;

public class OuterClass2 {

	private String name;

	public OuterClass2(String name) {
		this.name = name;
	}

	public void createLocalClassInstance() {
		
//		로컬클래스 : 메소드 내부에 선언되어 사용하는 클래스
		class LocalClass {
			void tell() {
				System.out.println("안녕하세요 " + name + "입니다.");
			}

		}
		
//		메소드 내부에서 내부 클래스를 이용한 인스턴스 생성 가능
		new LocalClass().tell();
	}
	public static void main(String[] args) {
		
		OuterClass2 o = new OuterClass2("King");
		
		o.createLocalClassInstance();
		
	}

}
