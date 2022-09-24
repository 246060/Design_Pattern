package iterator.case2;

import iterator.case2.Aggregate.ChannelCollection;
import iterator.case2.ConcreteAggregate.ChannelCollectionImpl;
import iterator.case2.Iterator.ChannelIterator;

import static iterator.case2.ChannelTypeEnum.*;

public class Client {

	public static void main(String[] args) {
		System.out.println();

		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ENGLISH));
		channels.addChannel(new Channel(99.5, HINDI));
		channels.addChannel(new Channel(100.5, FRENCH));
		channels.addChannel(new Channel(101.5, ENGLISH));
		channels.addChannel(new Channel(102.5, HINDI));
		channels.addChannel(new Channel(103.5, FRENCH));
		channels.addChannel(new Channel(104.5, ENGLISH));
		channels.addChannel(new Channel(105.5, HINDI));
		channels.addChannel(new Channel(106.5, FRENCH));

		ChannelIterator baseIterator = channels.iterator(ALL);
		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c);
		}

		System.out.println("\n==================================================\n");

		// Channel Type Iterator
		ChannelIterator englishIterator = channels.iterator(ENGLISH);
		while (englishIterator.hasNext()) {
			Channel c = englishIterator.next();
			System.out.println(c);
		}

	}

}
