package chapter08.Phone;

public class PhoneMain {

	public static void main(String[] args) {
		
		PhoneImpl phone1 = new PhoneImpl();
		
		phone1.call();
		
		phone1.turnOn();
		
		phone1.turnOff();
		SmartPhone2 smartPhone2 = new SmartPhone2("mini@naver.com");
		
		smartPhone2.turnOn();
		
		smartPhone2.call();
		
		System.out.println();
		
		smartPhone2.appRun("카카오톡");
		
		System.out.println();
		
		smartPhone2.appStop("카카오톡");
		
		
		

	}

}
