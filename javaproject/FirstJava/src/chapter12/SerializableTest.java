package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class SerializableTest {

	public static void main(String[] args) {
		
		
		ObjectInputStream inputStream = null;
		
		try {
			inputStream = new ObjectInputStream(new FileInputStream("instanceData.ser"));
			
//			String str = (String)inputStream.readObject();
			
			Person p = (Person)inputStream.readObject();
			
//			System.out.println(str);
			ArrayList<Person> list = new ArrayList<>();
			list.add(new Person("박민1", 21));
			list.add(new Person("박민2", 22));
			list.add(new Person("박민3", 23));
			list.add(new Person("박민4", 24));
			list.add(new Person("박민5", 25));
			
	
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

	}

}
