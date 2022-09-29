package retry.case1.exception;

/**
 * The top-most type in our exception hierarchy that signifies that an unexpected error condition
 * occurred. Its use is reserved as a "catch-all" for cases where no other subtype captures the
 * specificity of the error condition in question. Calling code is not expected to be able to handle
 * this error and should be reported to the maintainers immediately.
 */
public class BusinessException extends Exception {

	private static final long serialVersionUID = 6235833142062144336L;

	public BusinessException(String message) {
		super(message);
	}
}
