package strategy.case2;

public abstract class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategy() {
        strategy.strategyMethod();
    }
}
