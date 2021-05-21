package factory_method.case1;

public class Client {

    // https://johngrib.github.io/wiki/factory-method-pattern/
    public static void main(String[] args) {

        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");

        card1.use();
        card2.use();
    }
}
