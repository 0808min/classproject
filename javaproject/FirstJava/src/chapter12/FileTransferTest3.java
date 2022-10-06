package chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTransferTest3 {
	
	public static void main(String[] args) {
		
//		파일복사
//		특정 파일의 데이터를 읽어서 다른 위치 파일에 쓰면 ? -> 복사
		
//		원본파일
		InputStream in = null;
//		복사본파일
		OutputStream out = null;
//		보조스트림(필터 스트림) : 기본스트립에 보조적인 역할을 하는 스트림
//		보조스트림을 이용하기 위해서는 기본스트림이 먼저 생성되어야 한다
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		try {
//			in = new FileInputStream("C:\\Test\\testfile2.txt");
			bin = new BufferedInputStream(new FileInputStream("C:\\Test\\testfile2.txt"));
			
//			out = new FileOutputStream("C:\\Test\\testfile2Copy.txt");
			bout = new BufferedOutputStream(new FileOutputStream("C:\\Test\\testfile2Copy.txt"));
			
			System.out.println("복사시작");
			
			while(true) {
				int data = in.read();
				
				if(data == -1) {
					break;
				}
				
				bout.write(data);
				
			}
			
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
					
				
			
		
	
		
	}

}
