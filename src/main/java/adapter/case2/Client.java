package adapter.case2;

public class Client {

    public static void main(String[] args) {

        /*
         * Duck 인터페이스 구현체에 Tuckey 인터페이스 구현체를 주입받아 Duck 인터페이스 명세로 변경하는 패턴
         * */

        // turkey -> duck
        Duck duck = new TurkeyAdapter(new WildTurkey());


        duck.quack();
        duck.fly();
    }
}
