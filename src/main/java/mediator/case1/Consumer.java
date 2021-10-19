package mediator.case1;

public class Consumer implements Runnable {
    // 3. Consumers are coupled only to the Mediator

    private Mediator mediator;
    private int id;
    private static int num = 1;

    public Consumer(Mediator mediator) {
        this.mediator = mediator;
        this.id = num++;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("c" + id + "-" + mediator.retrieveMessage());
        }
    }
}
