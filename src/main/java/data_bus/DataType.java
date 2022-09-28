
package data_bus;

/**
 * Events are sent via the Data-Bus.
 */

public interface DataType {

  /**
   * Returns the data-bus the event is being sent on.
   */
  DataBus getDataBus();

  /**
   * Set the data-bus the event will be sent on.
   */
  void setDataBus(DataBus dataBus);
}
