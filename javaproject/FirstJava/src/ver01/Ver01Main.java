package ver01;

public class Ver01Main {

	public static void main(String[] args) {
		
//		실행 과정 
//		 main()메소드를 정의합니다.
//		 연락처 데이터를 저장하는 인스턴스를 생성합니다.
//		 변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력합니다.
//		 생성된 인스턴스의 정보 출력 메소드를 호출합니다.
//		 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다.
//		 인스턴스의 출력메소드를 다시 실행합니다

		Ver01 person = new Ver01();

		person.setName("박민");
		person.setPhoneNumber("01075471556");
		person.setEmail("min0808mini@naver.com");
		person.setAddress("서울시");
		person.setBirthday(19910808);
		person.setGroup("a");
		person.tell();


	}

}
