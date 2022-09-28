package chapter09;

import java.math.BicInteger;

public class BicIntegerTest {
	
	public static void main(String[] args) {
		
		BicInteger bi1 = new BicInteger("10000000000000000000000");
		BicInteger bi2 = new BicInteger("10000000000000000000000");
		
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multply(bi2));
		System.out.println(bi1.divide(bi2));
		
	}

}
