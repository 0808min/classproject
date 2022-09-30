package Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("민");
		list.add("박");
		list.add(new String("주"));

		System.out.println("저장된 요소의 개수 : " + list.size());

		System.out.println(list.get(0));

		System.out.println("전체 리스트 출력 ========== ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			printAll(list);
			
			list.add(1, "경");
			printAll(list);
		}

	}
	
	static void printAll(List<String> list) {
		
		System.out.println("전체 리스트 출력 ========== ");
		for(String name : list) {
			System.out.println(name);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));

		}
		
	}

}
