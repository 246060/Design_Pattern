package lockable_object.case1;

public class LockingException extends RuntimeException {

  private static final long serialVersionUID = 8556381044865867037L;

  public LockingException(String message) {
    super(message);
  }
}
