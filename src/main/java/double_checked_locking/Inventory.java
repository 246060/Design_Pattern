package double_checked_locking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lombok.extern.slf4j.Slf4j;

/**
 * Inventory.
 */
@Slf4j
public class Inventory {

  private final int inventorySize;
  private final List<Item> items;
  private final Lock lock;

  /**
   * Constructor.
   */
  public Inventory(int inventorySize) {
    this.inventorySize = inventorySize;
    this.items = new ArrayList<>(inventorySize);
    this.lock = new ReentrantLock();
  }

  /**
   * Add item.
   */
  public boolean addItem(Item item) {
    if (items.size() < inventorySize) {
      lock.lock();
      try {
        if (items.size() < inventorySize) {
          items.add(item);
          var thread = Thread.currentThread();
          log.info("{}: items.size()={}, inventorySize={}", thread, items.size(), inventorySize);
          return true;
        }
      } finally {
        lock.unlock();
      }
    }
    return false;
  }

  /**
   * Get all the items in the inventory.
   *
   * @return All the items of the inventory, as an unmodifiable list
   */
  public final List<Item> getItems() {
    return List.copyOf(items);
  }

}
