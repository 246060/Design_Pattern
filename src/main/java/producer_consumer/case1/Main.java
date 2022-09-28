package producer_consumer.case1;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Main {

  public static void main(String[] args) {

    var queue = new ItemQueue();
    var executorService = Executors.newFixedThreadPool(5);

    for (var i = 0; i < 2; i++) {
      final var producer = new Producer("Producer_" + i, queue);

      executorService.submit(() -> {
        while (true) {
          producer.produce();
        }
      });
    }

    for (var i = 0; i < 3; i++) {
      final var consumer = new Consumer("Consumer_" + i, queue);

      executorService.submit(() -> {
        while (true) {
          consumer.consume();
        }
      });
    }

    executorService.shutdown();

    try {
      executorService.awaitTermination(10, TimeUnit.SECONDS);
      executorService.shutdownNow();

    } catch (InterruptedException e) {
      System.out.println("Error waiting for ExecutorService shutdown");
    }
  }
}
