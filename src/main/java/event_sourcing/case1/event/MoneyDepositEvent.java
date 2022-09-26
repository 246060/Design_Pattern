package event_sourcing.case1.event;

import java.math.BigDecimal;
import java.util.Optional;

import event_sourcing.case1.state.AccountAggregate;
import lombok.Getter;

/**
 * This is the class that implements money deposit event. Holds the necessary info for a money
 * deposit event. Implements the process function that finds the event related domain objects and
 * calls the related domain object's handle event functions
 *
 * <p>Created by Serdar Hamzaogullari on 06.08.2017.
 */
@Getter
public class MoneyDepositEvent extends DomainEvent {

	private final BigDecimal money;
	private final int accountNo;

	/**
	 * Instantiates a new Money deposit event.
	 *
	 * @param sequenceId  the sequence id
	 * @param createdTime the created time
	 * @param accountNo   the account no
	 * @param money       the money
	 */
	public MoneyDepositEvent(long sequenceId, long createdTime, int accountNo, BigDecimal money) {
		super(sequenceId, createdTime, "MoneyDepositEvent");
		this.money = money;
		this.accountNo = accountNo;
	}

	@Override
	public void process() {
		var account = Optional.ofNullable(AccountAggregate.getAccount(accountNo)).orElseThrow(() -> new RuntimeException("Account not found"));
		account.handleEvent(this);
	}
}
