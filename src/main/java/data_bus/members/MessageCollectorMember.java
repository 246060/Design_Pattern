package data_bus.members;

import java.util.ArrayList;
import java.util.List;

import data_bus.DataType;
import data_bus.Member;
import data_bus.data.MessageData;
import lombok.extern.slf4j.Slf4j;

/**
 * Receiver of Data-Bus events that collects the messages from each {@link MessageData}.
 */
@Slf4j
public class MessageCollectorMember implements Member {

  private final String name;
  private final List<String> messages = new ArrayList<>();

  public MessageCollectorMember(String name) {
    this.name = name;
  }

  @Override
  public void accept(final DataType data) {
    if (data instanceof MessageData) {
      handleEvent((MessageData) data);
    }
  }

  private void handleEvent(MessageData data) {
    log.info("{} sees message {}", name, data.getMessage());
    messages.add(data.getMessage());
  }

  public List<String> getMessages() {
    return List.copyOf(messages);
  }
}
