package wipro.collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
	public static void main(String[] args) {
		Queue<Integer> pQ = new PriorityQueue<>();
		pQ.add(99);
		pQ.add(96);
		pQ.add(66);
		pQ.add(84);
		System.out.println(pQ);
		System.out.println(pQ.poll());
		System.out.println(pQ);
		System.out.println(pQ.peek());
	}
}
