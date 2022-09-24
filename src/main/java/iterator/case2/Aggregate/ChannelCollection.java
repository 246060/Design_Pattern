package iterator.case2.Aggregate;

import iterator.case2.Channel;
import iterator.case2.Iterator.ChannelIterator;
import iterator.case2.ChannelTypeEnum;

public interface ChannelCollection {
	void addChannel(Channel c);
	void removeChannel(Channel c);
	ChannelIterator iterator(ChannelTypeEnum type);
}
