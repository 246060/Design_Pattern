package strategy.case3;

public class Client {

    public static void main(String[] args) {
        Strategy[] strategies = {new Bar(), new Foo()};
        for (Strategy strategy : strategies) {
            strategy.solve();
        }
    }
}
