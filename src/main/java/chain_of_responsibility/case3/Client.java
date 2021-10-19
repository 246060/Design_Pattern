package chain_of_responsibility.case3;

public class Client {

    // https://lktprogrammer.tistory.com/45

    public static void main(String[] args) {
        Receiver Odd = new OddReceiver("홀수 리시버");
        Receiver Even = new EvenReceiver("짝수 리시버");

        Odd.setNext(Even);

        for (int i = 0; i <= 20; i++) {
            Odd.support(i);
        }
    }
}
