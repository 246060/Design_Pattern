package iterator.case5.ConcreteAggregate;

import iterator.case5.ConcreteIterator.TopicIterator;
import iterator.case5.Iterator.Iterator;
import iterator.case5.Aggregate.List;
import iterator.case5.Topic;

public class TopicList implements List<Topic> {

	private Topic[] topics;

	public TopicList(Topic[] topics) {
		this.topics = topics;
	}

	@Override
	public Iterator<Topic> iterator() {
		return new TopicIterator(topics);
	}
}
