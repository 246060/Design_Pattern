package event_sourcing.case1.event;

import java.math.BigDecimal;
import java.util.Optional;

import event_sourcing.case1.state.AccountAggregate;
import lombok.Getter;

/**
 * Implements the process function that finds the event related domain objects and calls the related domain object's handle event functions
 */
@Getter
public class MoneyTransferEvent extends DomainEvent {

	private final BigDecimal money;
	private final int accountNoFrom;
	private final int accountNoTo;

	public MoneyTransferEvent(long sequenceId, long createdTime, BigDecimal money, int accountNoFrom, int accountNoTo) {
		super(sequenceId, createdTime, "MoneyTransferEvent");
		this.money = money;
		this.accountNoFrom = accountNoFrom;
		this.accountNoTo = accountNoTo;
	}

	@Override
	public void process() {

		var accountFrom =
						Optional.ofNullable(AccountAggregate.getAccount(accountNoFrom))
										.orElseThrow(() -> new RuntimeException("Account not found " + accountNoFrom));

		var accountTo =
						Optional.ofNullable(AccountAggregate.getAccount(accountNoTo))
										.orElseThrow(() -> new RuntimeException("Account not found " + accountNoTo));

		accountFrom.handleTransferFromEvent(this);
		accountTo.handleTransferToEvent(this);
	}
}
