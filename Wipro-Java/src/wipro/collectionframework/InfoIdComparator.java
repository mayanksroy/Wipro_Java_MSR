package wipro.collectionframework;

import java.util.Comparator;

public class InfoIdComparator implements Comparator<Info> {

	@Override
	public int compare(Info o1, Info o2) {
		return o1.getId().compareTo(o2.getId());
	}

}
