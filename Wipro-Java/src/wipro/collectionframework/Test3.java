package wipro.collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test3 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		
		for(int i=1;i<11;i++) {
			l1.add(i);
		}
//		System.out.println(l1);
		
		ListIterator<Integer> itr = l1.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("In Backward Direction");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
