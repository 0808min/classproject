package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTransferTest1 {
	
	public static void main(String[] args) {
		
//		파일복사
//		특정 파일의 데이터를 읽어서 다른 위치 파일에 쓰면 ? -> 복사
		
//		원본파일
		InputStream in = null;
		OutputStream out = null;
		
		int copyByte = 0; // 총 복사한 데이터 사이즈
		int bytrDataSize = 0;
		byte[] bufData = new byte(1024);
		
		try {
			in = new FileInputStream("C:\\Test\\testfile2.txt");
			
			while(true) {
				int data = in.read(bufData);
				
				if(data == -1) {
					break;
				}
				
				out.write(bufData, 0, bytrDataSize);
				
				System.out.println("복사완료");
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out = new FileOutputStream("C:\\Test\\testfile2Copy.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(in != null) {
				
					
				
			}
		}
		
		
	}

}
