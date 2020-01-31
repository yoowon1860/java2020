import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {

		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("유원상", 95);
		scoreMap.put("유원상2", 95);
		scoreMap.put("유원상3", 9);
		scoreMap.put("유원상4", 5);
		scoreMap.put("유원상5", 95);
		scoreMap.put("유원상6", 5);
		
		System.out.println("HashMap의 요소 개수 : "+ scoreMap.size());
		
		Set<String> keys = scoreMap.keySet(); //해시맵 h에있는 모든 키를 Set컬렉션으로 리턴
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name+":"+score);
		}
	}

}
