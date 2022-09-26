package throttling.case1;

import java.security.InvalidParameterException;


/**
 * BarCustomer is a tenant with a name and a number of allowed calls per second.
 */
public class BarCustomer {

	private final String name;
	private final int allowedCallsPerSecond;

	/**
	 * @param name                  Name of the BarCustomer
	 * @param allowedCallsPerSecond The number of calls allowed for this particular tenant.
	 */
	public BarCustomer(String name, int allowedCallsPerSecond, CallsCount callsCount) {

		if (allowedCallsPerSecond < 0) {
			throw new InvalidParameterException("Number of calls less than 0 not allowed");
		}

		this.name = name;
		this.allowedCallsPerSecond = allowedCallsPerSecond;

		callsCount.addTenant(name);
	}

	public String getName() {
		return name;
	}

	public int getAllowedCallsPerSecond() {
		return allowedCallsPerSecond;
	}
}
