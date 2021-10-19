package mediator.case1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    // https://sourcemaking.com/design_patterns/mediator/java/2
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER for exit");

        Mediator mb = new Mediator();
        List<Thread> producerList = new ArrayList<>();

        producerList.add(new Thread(new Producer(mb)));
        producerList.add(new Thread(new Producer(mb)));

        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));

        for (Thread p : producerList) {
            p.start();
        }

        boolean stop = false;
        String exit = scanner.nextLine();

        while (!stop) {
            if (exit.equals("")) {
                stop = true;
                for (Thread p : producerList) {
                    //noinspection deprecation
                    p.stop();
                }
            }
        }
    }
}
