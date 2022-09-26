package event_sourcing.case1.domain;

import java.math.BigDecimal;

import event_sourcing.case1.event.AccountCreateEvent;
import event_sourcing.case1.event.MoneyDepositEvent;
import event_sourcing.case1.event.MoneyTransferEvent;
import event_sourcing.case1.state.AccountAggregate;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * This is the Account class that holds the account info, the account number, account owner name and
 * money of the account. Account class also have the business logic of events that effects this
 * account.
 */
@Setter
@Getter
@RequiredArgsConstructor
@Slf4j
public class Account {

	private final int accountNo;
	private final String owner;
	private BigDecimal money = BigDecimal.ZERO;

	private static final String MSG = "Some external api for only realtime execution could be called here.";

	public Account copy() {
		var account = new Account(accountNo, owner);
		account.setMoney(money);
		return account;
	}

	@Override
	public String toString() {
		return "Account{" + "accountNo=" + accountNo + ", owner='" + owner + '\'' + ", money=" + money + '}';
	}

	private void depositMoney(BigDecimal money) {
		this.money = this.money.add(money);
	}

	private void withdrawMoney(BigDecimal money) {
		this.money = this.money.subtract(money);
	}

	private void handleDeposit(BigDecimal money, boolean realTime) {
		depositMoney(money);
		AccountAggregate.putAccount(this);
		if (realTime) {
			log.info(MSG);
		}
	}

	private void handleWithdrawal(BigDecimal money, boolean realTime) {
		if (this.money.compareTo(money) < 0) {
			throw new RuntimeException("Insufficient Account Balance");
		}

		withdrawMoney(money);
		AccountAggregate.putAccount(this);
		if (realTime) {
			log.info(MSG);
		}
	}

	/**
	 * Handles the MoneyDepositEvent.
	 *
	 * @param moneyDepositEvent the money deposit event
	 */
	public void handleEvent(MoneyDepositEvent moneyDepositEvent) {
		handleDeposit(moneyDepositEvent.getMoney(), moneyDepositEvent.isRealTime());
	}


	/**
	 * Handles the AccountCreateEvent.
	 *
	 * @param accountCreateEvent the account create event
	 */
	public void handleEvent(AccountCreateEvent accountCreateEvent) {
		AccountAggregate.putAccount(this);
		if (accountCreateEvent.isRealTime()) {
			log.info(MSG);
		}
	}

	/**
	 * Handles transfer from account event.
	 *
	 * @param moneyTransferEvent the money transfer event
	 */
	public void handleTransferFromEvent(MoneyTransferEvent moneyTransferEvent) {
		handleWithdrawal(moneyTransferEvent.getMoney(), moneyTransferEvent.isRealTime());
	}

	/**
	 * Handles transfer to account event.
	 *
	 * @param moneyTransferEvent the money transfer event
	 */
	public void handleTransferToEvent(MoneyTransferEvent moneyTransferEvent) {
		handleDeposit(moneyTransferEvent.getMoney(), moneyTransferEvent.isRealTime());
	}


}
