package strategy.case7.ConcreteStrategy;

import strategy.case7.Strategy.ISocialMediaStrategy;

public class OrkutStrategy implements ISocialMediaStrategy {

	public void connectTo(String friendName) {
		System.out.println("Connecting with " + friendName + " through Orkut [not possible though :)]");
	}
}
