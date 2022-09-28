
package data_bus.members;

import java.time.LocalDateTime;

import data_bus.DataType;
import data_bus.Member;
import data_bus.data.MessageData;
import data_bus.data.StartingData;
import data_bus.data.StoppingData;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Receiver of Data-Bus events.
 */
@Getter
@Slf4j
@RequiredArgsConstructor
public class StatusMember implements Member {

  private final int id;

  private LocalDateTime started;

  private LocalDateTime stopped;

  @Override
  public void accept(final DataType data) {
    if (data instanceof StartingData) {
      handleEvent((StartingData) data);
    } else if (data instanceof StoppingData) {
      handleEvent((StoppingData) data);
    }
  }

  private void handleEvent(StartingData data) {
    started = data.getWhen();
    log.info("Receiver {} sees application started at {}", id, started);
  }

  private void handleEvent(StoppingData data) {
    stopped = data.getWhen();
    log.info("Receiver {} sees application stopping at {}", id, stopped);
    log.info("Receiver {} sending goodbye message", id);
    data.getDataBus().publish(MessageData.of(String.format("Goodbye cruel world from #%d!", id)));
  }

}
