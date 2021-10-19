package builder.case1;

abstract public class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        this.pizza = new Pizza();
    }

    abstract public void buildDough();
    abstract public void buildSauce();
    abstract public void buildTopping();
}
