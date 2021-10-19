package observer.case2;

import java.util.Scanner;

public class Client {

    // https://sourcemaking.com/design_patterns/observer/java/1
    public static void main(String[] args) {

        Subject sub = new Subject();

        // Client configures the number and type of Observers
        sub.add(new HexObserver());
        sub.add(new OctObserver());
        sub.add(new BinObserver());

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}
