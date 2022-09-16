package strategy.case3.strategy;

public abstract class StrategySearch implements Strategy {

	@Override // Template Method
	public void solve() {

		while (true) {
			preProcess();
			if (search()) {
				break;
			}
			postProcess();
		}
	}

	protected abstract void preProcess();
	protected abstract boolean search();
	protected abstract void postProcess();
}
