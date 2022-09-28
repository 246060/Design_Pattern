package producer_consumer.case1;

import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;


@Slf4j
public class Producer {

  private static final SecureRandom RANDOM = new SecureRandom();
  private final ItemQueue queue;
  private final String name;
  private int itemId;

  public Producer(String name, ItemQueue queue) {
    this.name = name;
    this.queue = queue;
  }

  public void produce() throws InterruptedException {
    var item = new Item(name, itemId++);
    queue.put(item);
    log.info("Producer [{}] produce item [{}]", name, item.getId());
    Thread.sleep(RANDOM.nextInt(2000));
  }
}
