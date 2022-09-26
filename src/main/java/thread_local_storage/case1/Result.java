package thread_local_storage.case1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Result object that will be returned by the Callable {@link DateFormatCallable} used in {@link App}.
 */
public class Result {
  // A list to collect the date values created in one thread
  private final List<Date> dateList = new ArrayList<>();

  // A list to collect Exceptions thrown in one threads (should be none in
  // this example)
  private final List<String> exceptionList = new ArrayList<>();

  /**
   * Get list of date values collected within a thread execution.
   * @return List of date values collected within an thread execution
   */
  public List<Date> getDateList() {
    return dateList;
  }

  /**
   * Get list of exceptions thrown within a thread execution.
   * @return List of exceptions thrown within an thread execution
   */
  public List<String> getExceptionList() {
    return exceptionList;
  }
}
