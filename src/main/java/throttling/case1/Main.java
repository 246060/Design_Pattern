package throttling.case1;

import throttling.case1.timer.ThrottleTimerImpl;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Throttling pattern is a design pattern to throttle or limit the use of resources or even a
 * complete service by users or a particular tenant. This can allow systems to continue to function
 * and meet service level agreements, even when an increase in demand places load on resources.
 * <p>
 * In this example there is a {@link Bartender} serving beer to {@link BarCustomer}s. This is a time
 * based throttling, i.e. only a certain number of calls are allowed per second.
 * </p>
 * ({@link BarCustomer}) is the service tenant class having a name and the number of calls allowed.
 * ({@link Bartender}) is the service which is consumed by the tenants and is throttled.
 */
public class Main {

	public static void main(String[] args) {

		var callsCount = new CallsCount();
		var human = new BarCustomer("young human", 2, callsCount);
		var dwarf = new BarCustomer("dwarf soldier", 4, callsCount);

		var executorService = Executors.newFixedThreadPool(2);

		executorService.execute(() -> makeServiceCalls(human, callsCount));
		executorService.execute(() -> makeServiceCalls(dwarf, callsCount));

		executorService.shutdown();
		try {
			if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
				executorService.shutdownNow();
			}
		} catch (InterruptedException e) {
			executorService.shutdownNow();
		}
	}

	/**
	 * Make calls to the bartender.
	 */
	private static void makeServiceCalls(BarCustomer barCustomer, CallsCount callsCount) {

		var timer = new ThrottleTimerImpl(1000, callsCount);
		var service = new Bartender(timer, callsCount);

		// Sleep is introduced to keep the output in check and easy to view and analyze the results.

		IntStream.range(0, 50).forEach(i -> {
			service.orderDrink(barCustomer);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted: " + e.getMessage());
			}
		});
	}
}
