package event_sourcing.case1.event;

import event_sourcing.case1.state.AccountAggregate;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * Implements the process function that finds the event related domain objects and calls the related domain object's handle event functions
 */
@Getter
public class MoneyDepositEvent extends DomainEvent {

	private final BigDecimal money;
	private final int accountNo;

	public MoneyDepositEvent(long sequenceId, long createdTime, int accountNo, BigDecimal money) {
		super(sequenceId, createdTime, "MoneyDepositEvent");
		this.money = money;
		this.accountNo = accountNo;
	}

	@Override
	public void process() {

		var account =
						Optional.ofNullable(AccountAggregate.getAccount(accountNo))
										.orElseThrow(() -> new RuntimeException("Account not found"));

		account.handleEvent(this);
	}
}
