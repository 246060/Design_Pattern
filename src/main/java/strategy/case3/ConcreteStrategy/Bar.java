package strategy.case3.ConcreteStrategy;

import strategy.case3.Strategy.StrategySearch;

public class Bar extends StrategySearch {

	private int state = 1;

	@Override
	protected void preProcess() {
		System.out.println("PreProcess  ");
	}

	@Override
	protected boolean search() {
		System.out.println("Search-" + state++ + "  ");
		return state == 3 ? true : false;
	}

	@Override
	protected void postProcess() {
		System.out.println("PostProcess  ");
	}
}
