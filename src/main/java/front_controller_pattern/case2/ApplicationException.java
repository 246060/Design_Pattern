package front_controller_pattern.case2;


public class ApplicationException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ApplicationException(Throwable cause) {
    super(cause);
  }
}
