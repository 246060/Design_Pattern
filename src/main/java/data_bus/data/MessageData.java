package data_bus.data;

import data_bus.AbstractDataType;
import data_bus.DataType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * An event raised when a string message is sent.
 *
 * @author Paul Campbell (pcampbell@kemitix.net)
 */
@Getter
@AllArgsConstructor
public class MessageData extends AbstractDataType {

  private final String message;

  public static DataType of(final String message) {
    return new MessageData(message);
  }
}
