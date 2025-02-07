package wipro.collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		Set<Object> s = new LinkedHashSet<>();
		s.add(100);
		s.add("Mayank");
		s.add(90);
		s.add(100);
		s.add(null);
		System.out.println(s);
		
//		for (Object o: s) {
//			System.out.println(o);
//		}
		
		Iterator<Object> itr = s.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}
