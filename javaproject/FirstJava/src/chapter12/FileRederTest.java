package chapter12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileRederTest {
	
	public static void main(String[] args) {
		
		char[] buf = new char[10];
		int readCnt = 0;
		
		Reader reader = null;
		
		try {
			reader = new FileReader("C:\\test\\testfile1.txt");
			
			while(true) {
				readCnt = reader.read(buf);
				if(readCnt == -1) {
					break;
				}
				
				System.out.println(new String(buf));
				
				
			}
				
				
				
				
			
			
		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
