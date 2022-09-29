package retry.case1;

import retry.case1.exception.BusinessException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * Finds a customer, returning its ID from our records.
 * <p>
 * This is an imaginary operation that, for some imagined input, returns the ID for a customer.
 * However, this is a "flaky" operation that is supposed to fail intermittently,
 * but for the purposes of this example it fails in a programmed way depending on the constructor parameters.
 */
public final class FindCustomer implements BusinessOperation<String> {

	private final String customerId;
	private final Deque<BusinessException> errors;

	public FindCustomer(String customerId, BusinessException... errors) {
		this.customerId = customerId;
		this.errors = new ArrayDeque<>(List.of(errors));
	}

	@Override
	public String perform() throws BusinessException {
		if (!this.errors.isEmpty()) {
			throw this.errors.pop();
		}

		return this.customerId;
	}
}
