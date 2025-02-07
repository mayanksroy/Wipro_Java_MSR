package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class SortedSetTest {

	@Test
	void testgetData() {
		Sortedset obj = new Sortedset();
		SortedSet<Integer> r = new TreeSet<Integer>();
		r.add(100);
		r.add(20);
		
		SortedSet<Integer> actualset = obj.getData();
		assertEquals(r, actualset);
		
	}
	

}
