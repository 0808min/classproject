package chapter11;

import java.util.LinkedList;

public class IteratorTest2 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator

		printAll(list);

	}

	static <E> void printAll(LinkedList<Integer> list) {

		for (E obj : list) {
			System.out.println(obj);

		}
	}
}
