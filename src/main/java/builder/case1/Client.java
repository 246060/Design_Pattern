package builder.case1;

public class Client {

    // https://ko.wikipedia.org/wiki/%EB%B9%8C%EB%8D%94_%ED%8C%A8%ED%84%B4
    public static void main(String[] args) {

        Cook cook = new Cook();

        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        cook.setPizzaBuilder(hawaiianPizzaBuilder);
        cook.constructPizza();

        Pizza pizza1 = cook.getPizza();


        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        cook.setPizzaBuilder(spicyPizzaBuilder);
        cook.constructPizza();

        Pizza pizza2 = cook.getPizza();
    }
}
