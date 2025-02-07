package wipro.collectionframework;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//using array list and list from collection interface

public class Test1 {
	public static void main(String[] args) {
		List<Object> l = new ArrayList<>();
		l.add(100);
		l.add(false);
		l.add("Mayank");
		l.add(100);
		l.add(null);
		System.out.println(l);
//		for (Object i:l) {
//			System.out.println(i);
//		}
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.get(0));
		System.out.println(l.contains("Mayank"));
		System.out.println(l.indexOf("Mayank"));
		System.out.println(l.lastIndexOf(100));
		System.out.println(l.remove(2));
		System.out.println(l);
		System.out.println(l.remove(null));
		System.out.println(l);
		l.add(3, 45);
		System.out.println(l);
		l.add(55);
		System.out.println(l);
//		l.clear();
//		System.out.println(l);
		l.add(2, 34);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		
		ListIterator<Object> itr = l.listIterator();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
