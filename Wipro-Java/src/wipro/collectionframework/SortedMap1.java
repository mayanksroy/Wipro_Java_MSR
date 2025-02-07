package wipro.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1 {
	public static void main(String[] args) {
		SortedMap<String, Integer> map = new TreeMap<>();
		map.put("A", 56);
		map.put("F", 89);
		map.put("W", 32);
		map.put("Q", 10);
		map.put("G", 47);
		
		
		/*
		 * Set<Entry<String,Integer>> s = map.entrySet();
		 * 
		 * for(Object o : s) { System.out.println(o); } }
		 * 
		 * for(Entry<String, Integer> me : map.entrySet()) {
		 * 
		 * System.out.println(me.getKey() + " " + me.getValue()); }
		 */
		 		
		SortedMap<Long, Info> sm = new TreeMap<>();
		 
		Info abc = new Info(10, "abc");
		Info ijk = new Info(4, "ijk");
		Info rst = new Info(56, "rst");
 
		sm.put(101L, abc);
		sm.put(555L, ijk);
		sm.put(876L, rst);
 
		List<Map.Entry<Long, Info>> list = new ArrayList<>(sm.entrySet());
 
		
		Collections.sort(list, new MyComparator());
 
		for (Map.Entry<Long, Info> entry : list) {
			System.out.println(
					entry.getKey() + " -> " + entry.getValue().getId() + " ," + entry.getValue().getName());
		}
	}
}
