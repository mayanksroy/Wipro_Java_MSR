package wipro.collectionframework;

import java.util.Comparator;

public class InfoNameComparator implements Comparator<Info> {

	@Override
	public int compare(Info o1, Info o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
