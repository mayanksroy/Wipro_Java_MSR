package wipro.collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetS {
	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<>();
		s.add(10);
		s.add(23);
		s.add(76);
		s.add(45);
		s.add(74);
		s.add(55);
		s.add(26);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(50));
		System.out.println(s.tailSet(50));
		System.out.println(s.subSet(30, 50));
	}
}
