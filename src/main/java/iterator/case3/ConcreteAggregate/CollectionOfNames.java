package iterator.case3.ConcreteAggregate;

import iterator.case3.Aggregate.Container;
import iterator.case3.Iterator.Iterator;

public class CollectionOfNames implements Container {

	public String name[] = {"Ashwani Rajput", "Soono Jaiswal", "Rishi Kumar", "Rahul Mehta", "Hemant Mishra"};


	@Override
	public Iterator getIterator() {
		return new CollectionOfNamesIterate();
	}


	private class CollectionOfNamesIterate implements Iterator {
		int i;

		@Override
		public boolean hasNext() {
			if (i < name.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return name[i++];
			}
			return null;
		}
	}
}
