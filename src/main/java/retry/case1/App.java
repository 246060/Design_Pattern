package retry.case1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retry.case1.exception.CustomerNotFoundException;

/**
 * The <em>Retry</em> pattern enables applications to handle potentially recoverable failures from
 * the environment if the business requirements and nature of the failures allow it. By retrying
 * failed operations on external dependencies, the application may maintain stability and minimize
 * negative impact on the user experience.
 *
 * <p>In our example, we have the {@link BusinessOperation} interface as an abstraction over all
 * operations that our application performs involving remote systems. The calling code should remain
 * decoupled from implementations.
 *
 * <p>{@link FindCustomer} is a business operation that looks up a customer's record and returns
 * its ID. Imagine its job is performed by looking up the customer in our local database and
 * returning its ID. We can pass {@link CustomerNotFoundException} as one of its {@link
 * FindCustomer#FindCustomer(String, com.iluwatar.retry.BusinessException...) constructor
 * parameters} in order to simulate not finding the customer.
 *
 * <p>Imagine that, lately, this operation has experienced intermittent failures due to some weird
 * corruption and/or locking in the data. After retrying a few times the customer is found. The
 * database is still, however, expected to always be available.  While a definitive solution is
 * found to the problem, our engineers advise us to retry the operation a set number of times with a
 * set delay between retries, although not too many retries otherwise the end user will be left
 * waiting for a long time, while delays that are too short will not allow the database to recover
 * from the load.
 *
 * <p>To keep the calling code as decoupled as possible from this workaround, we have implemented
 * the retry mechanism as a {@link BusinessOperation} named {@link Retry}.
 */
public final class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static final String NOT_FOUND = "not found";
	private static BusinessOperation<String> op;

	public static void main(String[] args) throws Exception {
		noErrors();
		errorNoRetry();
		errorWithRetry();
		errorWithRetryExponentialBackoff();
	}

	private static void noErrors() throws Exception {
		op = new FindCustomer("123");
		op.perform();

		LOG.info("Sometimes the operation executes with no errors.");
	}

	private static void errorNoRetry() throws Exception {
		op = new FindCustomer("123", new CustomerNotFoundException(NOT_FOUND));

		try {
			op.perform();
		} catch (CustomerNotFoundException e) {
			LOG.info("Yet the operation will throw an error every once in a while.");
		}
	}

	private static void errorWithRetry() throws Exception {

		final var retry = new Retry<>(
						new FindCustomer("123", new CustomerNotFoundException(NOT_FOUND)),
						3,  // 3 attempts
						100, //100 ms delay between attempts
						e -> CustomerNotFoundException.class.isAssignableFrom(e.getClass())
		);

		op = retry;
		final var customerId = op.perform();

		LOG.info(String.format(
						"However, retrying the operation while ignoring a recoverable error will eventually yield " + "the result %s after a number of attempts %s", customerId, retry.attempts())
		);
	}

	private static void errorWithRetryExponentialBackoff() throws Exception {

		final var retry = new RetryExponentialBackoff<>(
						new FindCustomer("123", new CustomerNotFoundException(NOT_FOUND)),
						6,  //6 attempts
						30000, //30 s max delay between attempts
						e -> CustomerNotFoundException.class.isAssignableFrom(e.getClass())
		);

		op = retry;
		final var customerId = op.perform();

		LOG.info(String.format(
						"However, retrying the operation while ignoring a recoverable error will eventually yield " + "the result %s after a number of attempts %s", customerId, retry.attempts())
		);
	}
}
