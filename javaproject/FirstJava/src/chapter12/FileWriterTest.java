package chapter12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		char[] charArr = {'B', 'C', 'D'};
		
		try {
			Writer writer = new FileWriter("c:\\Test\\text1.txt");
			
			writer.write(ch);
			writer.write(charArr);
			
			
			System.out.println("파일에 텍스트 문자열 쓰기완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
	}

}
