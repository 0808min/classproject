package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	
	public static void main(String[] args) {
		
		BufferedWriter out = null;
		
		try {
			out = new BufferedWriter(new FileWriter("C:\\Test\\testfile1.txt"));
			
			out.write("구글과 넷플릭스에 이어 세계 최대 게임방송 플랫폼으로 꼽히는 트위치까지 '망 이용료 의무 부과'에 반대하는 여론전");
			out.newLine();
			out.write("나서며 국내 통신업계와 갈등이 고조되고 있다. 정치권에선 여야를 막론하고 망 이용료 의무부과를 명시한 법안 7개가 발의됐지만, 각");
			out.newLine();
			out.write("당 내부에서부터 혼선이 일면서 당론에 대한 교통정리가 선행돼야 한다는 지적이 나온다");
			out.newLine();
			out.newLine();
			out.write("나무위키");
			
			System.out.println("작성완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
