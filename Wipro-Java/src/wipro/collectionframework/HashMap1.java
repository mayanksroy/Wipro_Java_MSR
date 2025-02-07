package wipro.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Mayank", 182);
		map.put("Pradeep", 304);
		map.put("Harshit", 467);
		map.put("Kaushik", 555);
		
		for(Object o : map.entrySet()) {
			System.out.println(o);
		}
	}
}
