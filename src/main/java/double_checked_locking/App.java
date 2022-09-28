package double_checked_locking;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;

/**
 * Double Checked Locking is a concurrency design pattern used to reduce the overhead of acquiring a
 * lock by first testing the locking criterion (the "lock hint") without actually acquiring the
 * lock. Only if the locking criterion check indicates that locking is required does the actual
 * locking logic proceed.
 *
 * <p>In {@link Inventory} we store the items with a given size. However, we do not store more
 * items than the inventory size. To address concurrent access problems we use double checked
 * locking to add item to inventory. In this method, the thread which gets the lock first adds the
 * item.
 */
@Slf4j
public class App {

  public static void main(String[] args) {

    final var inventory = new Inventory(1000);

    var executorService = Executors.newFixedThreadPool(3);

    IntStream.range(0, 3).<Runnable>mapToObj(i -> () -> {
      while (inventory.addItem(new Item())) {
        log.info("Adding another item");
      }
    }).forEach(executorService::execute);

    executorService.shutdown();

    try {
      executorService.awaitTermination(5, TimeUnit.SECONDS);

    } catch (InterruptedException e) {
      log.error("Error waiting for ExecutorService shutdown");
      Thread.currentThread().interrupt();
    }
  }
}
