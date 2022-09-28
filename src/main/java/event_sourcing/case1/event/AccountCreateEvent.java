package event_sourcing.case1.event;

import event_sourcing.case1.domain.Account;
import event_sourcing.case1.state.AccountAggregate;
import lombok.Getter;

/**
 * Implements the process function that finds the event related domain objects and calls the related domain object's handle event functions
 */
@Getter
public class AccountCreateEvent extends DomainEvent {

	private final int accountNo;
	private final String owner;

	public AccountCreateEvent(long sequenceId, long createdTime, int accountNo, String owner) {
		super(sequenceId, createdTime, "AccountCreateEvent");
		this.accountNo = accountNo;
		this.owner = owner;
	}

	@Override
	public void process() {

		var account = AccountAggregate.getAccount(accountNo);
		if (account != null) {
			throw new RuntimeException("Account already exists");
		}

		account = new Account(accountNo, owner);
		account.handleEvent(this);
	}
}
