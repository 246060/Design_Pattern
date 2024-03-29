

package data_bus;

import lombok.Getter;
import lombok.Setter;

/**
 * Base for data to send via the Data-Bus.
 */
@Getter
@Setter
public class AbstractDataType implements DataType {

  private DataBus dataBus;
}
