package Test;

public class Calculator {

	public static void main(String[] args) {
		
		
		
		System.out.println("43+24=" + add(43,24) ); 	
		System.out.println("43-33=" + substract(43,33) ); 
		System.out.println("66*43=" + multifly(66,43)); 
		System.out.println("42/7=" + divide(42,7));
		
		

	}
	
	
	public static long add(long num1, long num2) {
		
		return num1+num2;
		
	}

	
	public static long substract(long num1, long num2) {
		
		return num1-num2;
	}
	
	
	public static long multifly(long num1, long num2) {
		
		return num1*num2;
	}
	
	
	public static double divide(double num1, double num2) {
		
		return num1 / num2;
	}
	
		

	
	}
		

	
	}
	
	
	

}
