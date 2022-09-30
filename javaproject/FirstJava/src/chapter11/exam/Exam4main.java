package chapter11.exam;

import java.util.HashMap;
import java.util.Map;

public class Exam4main {

	public static void main(String[] args) {
//		4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 
//		Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다. 

		Map<Integer, FootballPlayer2> players = new HashMap<>();
		
//		저장 : put
		players.put(7, new FootballPlayer2("음바페", 7, "생제르멩", 25));
		players.put(7, new FootballPlayer2("음바페", 7, "생제르멩", 25));
		
//		System.out.println(players.get(7));
		
		FootballPlayer2 player = player.get(7);
		
	}

}
