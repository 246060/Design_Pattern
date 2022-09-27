package strategy.case7.Context;

import strategy.case7.Strategy.ISocialMediaStrategy;

public class SocialMediaContext {

	ISocialMediaStrategy smStrategy;

	public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy) {
		this.smStrategy = smStrategy;
	}

	public void connect(String name) {
		smStrategy.connectTo(name);
	}
}
