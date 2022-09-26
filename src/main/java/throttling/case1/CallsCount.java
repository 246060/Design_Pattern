package throttling.case1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

// A class to keep track of the counter of different Tenants.
public final class CallsCount {

	private final Map<String, AtomicLong> tenantCallsCount = new ConcurrentHashMap<>();

	public void addTenant(String tenantName) {
		tenantCallsCount.putIfAbsent(tenantName, new AtomicLong(0));
	}

	public void incrementCount(String tenantName) {
		tenantCallsCount.get(tenantName).incrementAndGet();
	}

	public long getCount(String tenantName) {
		return tenantCallsCount.get(tenantName).get();
	}

	// Resets the count of all the tenants in the map.
	public void reset() {
		tenantCallsCount.replaceAll((k, v) -> new AtomicLong(0));
		System.out.println("reset counters");
	}
}
