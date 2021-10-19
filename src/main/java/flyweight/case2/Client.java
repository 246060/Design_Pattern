package flyweight.case2;

public class Client {

    // https://effectiveprogramming.tistory.com/entry/Flyweight-%ED%8C%A8%ED%84%B4
    public static void main(String[] args) {
        Flyweight flyweight = new Flyweight();

        flyweight.getSubject("a");
        flyweight.getSubject("a");
        flyweight.getSubject("b");
        flyweight.getSubject("b");
        flyweight.getSubject("a");
    }
}
