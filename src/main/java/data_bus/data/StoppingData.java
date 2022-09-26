package data_bus.data;

import java.time.LocalDateTime;

import data_bus.AbstractDataType;
import data_bus.DataType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * An event raised when applications stops, containing the stop time of the application.
 *
 * @author Paul Campbell (pcampbell@kemitix.net)
 */
@RequiredArgsConstructor
@Getter
public class StoppingData extends AbstractDataType {

  private final LocalDateTime when;

  public static DataType of(final LocalDateTime when) {
    return new StoppingData(when);
  }
}
