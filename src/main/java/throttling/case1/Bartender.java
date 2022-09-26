package throttling.case1;

import throttling.case1.timer.Throttler;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Bartender is a service which accepts a BarCustomer (tenant) and throttles
 * the resource based on the time given to the tenant.
 */
class Bartender {

	private final CallsCount callsCount;

	public Bartender(Throttler timer, CallsCount callsCount) {
		this.callsCount = callsCount;
		timer.start();
	}

	public int orderDrink(BarCustomer barCustomer) {
		var tenantName = barCustomer.getName();
		var count = callsCount.getCount(tenantName);

		if (count >= barCustomer.getAllowedCallsPerSecond()) {
			System.out.println("I'm sorry " + tenantName + ", you've had enough for today!");
			return -1;
		}

		callsCount.incrementCount(tenantName);
		System.out.println("Serving beer to " + barCustomer.getName() + " : [" + count + 1 + " consumed] ");

		return getRandomCustomerId();
	}

	private int getRandomCustomerId() {
		return ThreadLocalRandom.current().nextInt(1, 10000);
	}
}
