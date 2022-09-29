package retry.case1.exception;


public final class DatabaseNotAvailableException extends BusinessException {

	private static final long serialVersionUID = -3750769625095997799L;

	public DatabaseNotAvailableException(String message) {
		super(message);
	}
}
