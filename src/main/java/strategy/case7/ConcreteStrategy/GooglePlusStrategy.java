package strategy.case7.ConcreteStrategy;

import strategy.case7.Strategy.ISocialMediaStrategy;

public class GooglePlusStrategy implements ISocialMediaStrategy {

	public void connectTo(String friendName) {
		System.out.println("Connecting with " + friendName + " through GooglePlus");
	}
}
