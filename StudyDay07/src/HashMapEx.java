import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("ya", "야");
		String ya = h.get("ya");
		System.out.println(ya);
		
		h.put("baby", "아기");
		h.put("love", "사랑");
		h.put("apple", "사과");
		
		int n = h.size();
		System.out.println(n);
		
		Set<String> keys = h.keySet(); //해시맵 h에있는 모든 키를 Set컬렉션으로 리턴
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key +","+value);
		}
		
		h.remove("ya");
		n = h.size();
		System.out.println(n);
		
	}

}
