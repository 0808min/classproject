package Test;

import ver01.Contact;

public class S {


	Contact data = new Contact("박민", "01075471556", "min0808mini@naver.com", "서울시", 19910808, null);
	
	System.out.println("이름: " + data.getName());
	System.out.println("전화번호: " + data.getPhoneNumber());
	System.out.println("email : " + data.getEmail());
	System.out.println("주소 : " + data.getAddress());
	System.out.println("생일 : " + data.getBirthday());
	System.out.println("그룹 : " + data.getGroup() == null ? "" : data.getGroup());

	data.tell();
	
	data.setName("박민");
	data.setPhoneNumber("01075471556");
	data.setEmail("min0808mini@naver.com");
	data.setAddress("서울시");
	data.setBirthday(19910808);
	data.setGroup("a");
	data.tell();

}

}


}
