package retry.case1;

import retry.case1.exception.BusinessException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/**
 * Decorates BusinessOperation business operation with "retry" capabilities.
 */
public final class RetryExponentialBackoff<T> implements BusinessOperation<T> {

	private static final Random RANDOM = new Random();
	private final BusinessOperation<T> op;
	private final int maxAttempts;
	private final long maxDelay;
	private final AtomicInteger attempts;
	private final Predicate<Exception> test;
	private final List<Exception> errors;

	/**
	 * Ctor.
	 *
	 * @param op          the BusinessOperation to retry
	 * @param maxAttempts number of times to retry
	 * @param ignoreTests tests to check whether the remote exception can be ignored. No exceptions will be ignored if no tests are given
	 */
	@SafeVarargs
	public RetryExponentialBackoff(BusinessOperation<T> op, int maxAttempts, long maxDelay, Predicate<Exception>... ignoreTests) {
		this.op = op;
		this.maxAttempts = maxAttempts;
		this.maxDelay = maxDelay;
		this.attempts = new AtomicInteger();
		this.test = Arrays.stream(ignoreTests).reduce(Predicate::or).orElse(e -> false);
		this.errors = new ArrayList<>();
	}

	/**
	 * The errors encountered while retrying, in the encounter order.
	 *
	 * @return the errors encountered while retrying
	 */
	public List<Exception> errors() {
		return Collections.unmodifiableList(this.errors);
	}

	/**
	 * The number of retries performed.
	 *
	 * @return the number of retries performed
	 */
	public int attempts() {
		return this.attempts.intValue();
	}

	@Override
	public T perform() throws BusinessException {

		do {

			try {
				return this.op.perform();

			} catch (BusinessException e) {
				this.errors.add(e);

				if (this.attempts.incrementAndGet() >= this.maxAttempts || !this.test.test(e)) {
					throw e;
				}

				try {
					var testDelay = (long) Math.pow(2, this.attempts()) * 1000 + RANDOM.nextInt(1000);
					var delay = Math.min(testDelay, this.maxDelay);
					Thread.sleep(delay);

				} catch (InterruptedException f) {
					//ignore
				}
			}

		} while (true);
	}
}

