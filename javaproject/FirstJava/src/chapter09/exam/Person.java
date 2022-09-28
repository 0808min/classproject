package chapter09.exam;

import chapter09.Car;

public class Person extends Object {

//	1. 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다. 

	String personNumber;

	Person(String personNumber) {
		this.personNumber = personNumber;
	}

	@Override
	public boolean equals(Object obj) {

		boolean result = false;

		if (obj != null && obj instanceof Person) {
			Person personNum = (Person) obj;
			result = this.personNumber.equals(personNum.personNumber);

		}

		return result;
	}

	@Override
	public String toString() {
		return "Person [personNumber = " + personNumber + "]";

	}

	public static void main(String[] args) {
		
		Person personNum1 = new Person("910808");
		Person personNum2 = new Person("930705");
		
		System.out.println(personNum1);
		System.out.println(personNum2);
		System.out.println("-------------------------------");
		
		
		if(personNum1.equals(personNum2)) {
			System.out.println("같은 정보입니다.");
			
		} else {
			System.out.println("다른 정보입니다.");
			
		}

	} 

}
