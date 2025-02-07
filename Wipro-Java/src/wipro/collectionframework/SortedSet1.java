package wipro.collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSet1 {
	public static void main(String[] args) {
		Comparator<Info> comp = Comparator
				.comparing(Info::getId);
		
		comp = comp.reversed();
		
		//using class comparator
//		TreeSet<Info> a1 = new TreeSet<>(new InfoIdComparator());
		
		TreeSet<Info> a1 = new TreeSet<>(comp);
		a1.add(new Info (16, "Mayank"));
		a1.add(new Info (24, "Pradeep"));
		a1.add(new Info (13, "Harshit"));
		a1.add(new Info (44, "Kaushik"));
		a1.add(new Info (5, "Lalit"));
		
//		System.out.println(a1);
		for (Info s1 : a1) {
			System.out.println(s1);
		}
	}
}
