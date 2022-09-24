package iterator.case3;

import iterator.case3.ConcreteAggregate.CollectionOfNames;
import iterator.case3.Iterator.Iterator;

public class Client {

	public static void main(String[] args) {

		CollectionOfNames cmpnyRepository = new CollectionOfNames();

		for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext(); ) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
