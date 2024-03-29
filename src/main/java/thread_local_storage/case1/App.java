package thread_local_storage.case1;

import java.util.Calendar;
import java.util.concurrent.Executors;

import lombok.extern.slf4j.Slf4j;

/**
 * ThreadLocal pattern
 *
 * <p>This App shows how to create an isolated space per each thread. In this example the usage of
 * SimpleDateFormat is made to be thread-safe. This is an example of the ThreadLocal pattern.
 *
 * <p>By applying the ThreadLocal pattern you can keep track of application instances or locale
 * settings throughout the handling of a request. The ThreadLocal class works like a static
 * variable, with the exception that it is only bound to the current thread! This allows us to use
 * static variables in a thread-safe way.
 *
 * <p>In Java, thread-local variables are implemented by the ThreadLocal class object. ThreadLocal
 * holds a variable of type T, which is accessible via get/set methods.
 *
 * <p>SimpleDateFormat is one of the basic Java classes and is not thread-safe. If you do not
 * isolate the instance of SimpleDateFormat per each thread then problems arise.
 *
 * <p>App converts the String date value 15/12/2015 to the Date format using the Java class
 * SimpleDateFormat. It does this 20 times using 4 threads, each doing it 5 times. With the usage of
 * as ThreadLocal in DateFormatCallable everything runs well. But if you comment out the ThreadLocal
 * variant (marked with "//TLTL") and comment in the non ThreadLocal variant (marked with
 * "//NTLNTL") you can see what will happen without the ThreadLocal. Most likely you will get
 * incorrect date values and / or exceptions.
 *
 * <p>This example clearly show what will happen when using non thread-safe classes in a thread. In
 * real life this may happen one in of 1.000 or 10.000 conversions and those are really hard to find
 * errors.
 *
 * @author Thomas Bauer, 2017
 */
@Slf4j
public class App {

	public static void main(String[] args) {

		var counterDateValues = 0;
		var counterExceptions = 0;

		// Create a callable
		var callableDf = new DateFormatCallable("dd/MM/yyyy", "15/12/2015");

		// start 4 threads, each using the same Callable instance
		var executor = Executors.newCachedThreadPool();

		var futureResult1 = executor.submit(callableDf);
		var futureResult2 = executor.submit(callableDf);
		var futureResult3 = executor.submit(callableDf);
		var futureResult4 = executor.submit(callableDf);

		try {
			var result = new Result[4];
			result[0] = futureResult1.get();
			result[1] = futureResult2.get();
			result[2] = futureResult3.get();
			result[3] = futureResult4.get();

			// Print results of thread executions (converted dates and raised exceptions)
			// and count them
			for (var value : result) {
				counterDateValues = counterDateValues + printAndCountDates(value);
				counterExceptions = counterExceptions + printAndCountExceptions(value);
			}

			// a correct run should deliver 20 times 15.12.2015
			// and a correct run shouldn't deliver any exception
			log.info("The List dateList contains " + counterDateValues + " date values");
			log.info("The List exceptionList contains " + counterExceptions + " exceptions");

		} catch (Exception e) {
			log.info("Abnormal end of program. Program throws exception: " + e);
		}

		executor.shutdown();
	}

	/**
	 * Print result (date values) of a thread execution and count dates.
	 *
	 * @param res contains results of a thread execution
	 */
	private static int printAndCountDates(Result res) {
		// a correct run should deliver 5 times 15.12.2015 per each thread
		var counter = 0;

		for (var dt : res.getDateList()) {
			counter++;

			var cal = Calendar.getInstance();
			cal.setTime(dt);

			// Formatted output of the date value: DD.MM.YYYY
			log.info(cal.get(Calendar.DAY_OF_MONTH) + "." + cal.get(Calendar.MONTH) + "." + cal.get(Calendar.YEAR));
		}

		return counter;
	}

	/**
	 * Print result (exceptions) of a thread execution and count exceptions.
	 *
	 * @param res contains results of a thread execution
	 * @return number of dates
	 */
	private static int printAndCountExceptions(Result res) {
		// a correct run shouldn't deliver any exception
		var counter = 0;

		for (var ex : res.getExceptionList()) {
			counter++;
			log.info(ex);
		}

		return counter;
	}
}
