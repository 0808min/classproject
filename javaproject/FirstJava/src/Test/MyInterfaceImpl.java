package Test;

import chapter11.MyInterface;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		// TODO Auto-generated method stub
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		// TODO Auto-generated method stub
		return t;
	}
	
	public static void main(String[] args) {
		
		MyInterfaceImpl<String, Integer> myClass = new MyInterfaceImpl<String, Integer>();
		
		System.out.println(myClass.method1("TEN"));
		System.out.println(myClass.method2(10));
		
	}

}