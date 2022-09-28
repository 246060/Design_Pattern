package monitor.case1;

import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The Monitor pattern is used in concurrent algorithms to achieve mutual exclusion.
 * Bank is a simple class that transfers money from an account to another account using {@link Bank#transfer}.
 * It can also return the balance of the bank account stored in the bank.
 * Main class uses ThreadPool to run threads that do transactions on the bank accounts.
 */
@Slf4j
public class Main {

	// Runner to perform a bunch of transfers and handle exception.
	public static void runner(Bank bank) {

		try {
			SecureRandom random = new SecureRandom();
			Thread.sleep(random.nextInt(1000));

			for (int i = 0; i < 1000000; i++) {
				bank.transfer(random.nextInt(4), random.nextInt(4), random.nextInt());
			}

		} catch (InterruptedException e) {
			log.info(e.getMessage());
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) {

		var bank = new Bank(4, 1000);

		Runnable runnable = () -> runner(bank);
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 5; i++) {
			executorService.execute(runnable);
		}
	}
}
