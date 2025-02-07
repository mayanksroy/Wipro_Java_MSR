package wipro.collectionframework;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MyComparator implements Comparator<Map.Entry<Long, Info>> {

	@Override
	public int compare(Entry<Long, Info> o1, Entry<Long, Info> o2) {
		return o1.getValue().getId().compareTo(o2.getValue().getId());
//		return -o1.getValue().getId().compareTo(o2.getValue().getId());
//		return o1.getValue().getName().compareTo(o2.getValue().getName());
//		return -o1.getValue().getName().compareTo(o2.getValue().getName());
	}

}
