package data_bus.data;

import java.time.LocalDateTime;

import data_bus.AbstractDataType;
import data_bus.DataType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * An event raised when applications starts, containing the start time of the application.
 */
@RequiredArgsConstructor
@Getter
public class StartingData extends AbstractDataType {

  private final LocalDateTime when;

  public static DataType of(final LocalDateTime when) {
    return new StartingData(when);
  }
}
