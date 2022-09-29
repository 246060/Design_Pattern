package retry.case1.exception;

/**
 * The severity of this error is bounded by its context: was the search for the customer triggered by an input from some end user, or were the search parameters pulled from your database?
 */
public final class CustomerNotFoundException extends BusinessException {

	private static final long serialVersionUID = -6972888602621778664L;

	public CustomerNotFoundException(String message) {
		super(message);
	}
}
