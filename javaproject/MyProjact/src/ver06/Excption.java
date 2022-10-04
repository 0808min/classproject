package ver06;

import java.util.regex.Pattern;

public class Excption extends SmartPhoneMain2 {
	
private String getException() {
		
//		2. 연락처 이름 이력 시에 공백에 대한 예외처리와 영문자와 한글만 허용하는 
//		예외 처리를 해봅시다. 
		
		String str = "abcABC가나다";
		boolean chk1 = Pattern.matches("^[a-zA-Z가-힣]*$", str);
		System.out.println(chk1);
		
		try {
			if (!chk1) {
				throw new Exception();
			}
		} catch(Exception e) {
			System.out.println("영문자, 한글만 입력 가능합니다.");
			
		}
		return str;
		
	
		
	}

}
