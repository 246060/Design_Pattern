package event_asynchronous.case1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Each Event runs as a separate/individual thread.
 */
@Slf4j
@RequiredArgsConstructor
public class Event implements IEvent, Runnable {

  private final int eventId;
  private final int eventTime;

  @Getter
  private final boolean synchronous;

  private Thread thread;
  private boolean isComplete = false;
  private ThreadCompleteListener eventListener;

  @Override
  public void start() {
    thread = new Thread(this);
    thread.start();
  }

  @Override
  public void stop() {
    if (null == thread) {
      return;
    }
    thread.interrupt();
  }

  @Override
  public void status() {
    if (!isComplete) {
      log.info("[{}] is not done.", eventId);
    } else {
      log.info("[{}] is done.", eventId);
    }
  }

  @Override
  public void run() {

    var currentTime = System.currentTimeMillis();
    var endTime = currentTime + (eventTime * 1000);

    while (System.currentTimeMillis() < endTime) {
      try {
        Thread.sleep(1000); // Sleep for 1 second.
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        return;
      }
    }

    isComplete = true;
    completed();
  }

  public final void addListener(final ThreadCompleteListener listener) {
    this.eventListener = listener;
  }

  public final void removeListener(final ThreadCompleteListener listener) {
    this.eventListener = null;
  }

  private void completed() {
    if (eventListener != null) {
      eventListener.completedEventHandler(eventId);
    }
  }
}
