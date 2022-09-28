package monitor.case1;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Bank {

	private final int[] accounts;

	public Bank(int accountNum, int baseAmount) {
		accounts = new int[accountNum];
		Arrays.fill(accounts, baseAmount);
	}

	/**
	 * Transfer amounts from one account to another.
	 *
	 * @param accountA - source account
	 * @param accountB - destination account
	 * @param amount   - amount to be transferred
	 */
	public synchronized void transfer(int accountA, int accountB, int amount) {
		if (accounts[accountA] >= amount) {
			accounts[accountB] += amount;
			accounts[accountA] -= amount;
			log.info("Transferred from account: {} to account: {} , amount: {} , balance: {}", accountA, accountB, amount, getBalance());
		}
	}

	public synchronized int getBalance() {
		int balance = 0;
		for (int account : accounts) {
			balance += account;
		}
		return balance;
	}

	public int[] getAccounts() {
		return accounts;
	}
}
