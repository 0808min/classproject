package chapter09;

public class StringTest {
	
	public static void main(String[] args) {
		
//		문자를열 다루는 String
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		
		System.out.println("str1 == str2 => " + (str1 == str2));
		System.out.println("str1 == str3 => " + (str1 == str3));
		
		System.out.println(str1.equals(str3));
		
		
	}

}
