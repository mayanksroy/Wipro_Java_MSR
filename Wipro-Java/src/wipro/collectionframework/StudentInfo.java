package wipro.collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentInfo {
	public static void main(String[] args) {
		Comparator<Students> comparator = Comparator
				.comparing(Students::getName)
				.thenComparing(Students::getAge);
		
		//for sorting in descending order
		//comparator = comparator.reversed();
		
		TreeSet<Students> st = new TreeSet<>(comparator);
		st.add(new Students(1, "Aniket", 18));
		st.add(new Students(2, "Sneha", 20));
		st.add(new Students(3, "Rahul", 22));
		st.add(new Students(4, "Aniket", 22));
		st.add(new Students(5, "Sneha", 19));
		st.add(new Students(6, "Pooja", 21));
		st.add(new Students(7, "Rahul", 20));
		st.add(new Students(8, "Megha", 23));
		st.add(new Students(9, "Pooja", 19));
		st.add(new Students(10, "Karan", 22));
		
		for (Students student : st) {
			System.out.println(student);
		}
	}
}
