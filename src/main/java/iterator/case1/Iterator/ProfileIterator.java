package iterator.case1.Iterator;

import iterator.case1.Profile;

public interface ProfileIterator {
	boolean hasNext();
	Profile getNext();
	void reset();
}
