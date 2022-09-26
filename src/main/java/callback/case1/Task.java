package callback.case1;

import java.util.Optional;

/**
 * Template-method class for callback hook execution.
 */
public abstract class Task {

  final void executeWith(Callback callback) {
    execute();
    Optional.ofNullable(callback).ifPresent(Callback::call);
  }

  public abstract void execute();
}
