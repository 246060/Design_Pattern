package event_sourcing.case1;

import event_sourcing.case1.event.AccountCreateEvent;
import event_sourcing.case1.event.MoneyDepositEvent;
import event_sourcing.case1.event.MoneyTransferEvent;
import event_sourcing.case1.processor.DomainEventProcessor;
import event_sourcing.case1.state.AccountAggregate;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Event Sourcing :
 *
 * Instead of storing just the current state of the data in a domain, use an append-only store to record the full series of actions taken on that data.
 * The store acts as the system of record and can be used to materialize the domain objects.
 * This can simplify tasks in complex domains, by avoiding the need to synchronize the data model and the business domain, while improving performance, scalability, and responsiveness.
 * It can also provide consistency for transactional data, and maintain full audit trails and history that can enable compensating actions.
 *
 * This App class is an example usage of Event Sourcing pattern.
 *
 * As an example, two bank account is created, then some money deposit and transfer actions are taken so a new state of accounts is created.
 * At that point, state is cleared in order to represent a system shot down.
 * After the shot down, system state is recovered by re-creating the past events from event journal.
 * Then state is printed so a user can view the last state is same with the state before system shot down.
 */
@Slf4j
public class App {

	public static final int ACCOUNT_OF_DAENERYS = 1;
	public static final int ACCOUNT_OF_JON = 2;

	public static void main(String[] args) {

		var eventProcessor = new DomainEventProcessor();

		log.info("Running the system first time............");
		eventProcessor.reset();


		log.info("Creating the accounts............");
		eventProcessor.process(new AccountCreateEvent(0, new Date().getTime(), ACCOUNT_OF_DAENERYS, "Daenerys Targaryen"));
		eventProcessor.process(new AccountCreateEvent(1, new Date().getTime(), ACCOUNT_OF_JON, "Jon Snow"));


		log.info("Do some money operations............");
		eventProcessor.process(new MoneyDepositEvent(2, new Date().getTime(), ACCOUNT_OF_DAENERYS, new BigDecimal("100000")));
		eventProcessor.process(new MoneyDepositEvent(3, new Date().getTime(), ACCOUNT_OF_JON, new BigDecimal("100")));
		eventProcessor.process(new MoneyTransferEvent(4, new Date().getTime(), new BigDecimal("10000"), ACCOUNT_OF_DAENERYS, ACCOUNT_OF_JON));


		log.info("...............State:............");
		log.info(AccountAggregate.getAccount(ACCOUNT_OF_DAENERYS).toString());
		log.info(AccountAggregate.getAccount(ACCOUNT_OF_JON).toString());


		log.info("At that point system had a shut down, state in memory is cleared............");
		AccountAggregate.resetState();


		log.info("Recover the system by the events in journal file............");
		eventProcessor = new DomainEventProcessor();
		eventProcessor.recover();


		log.info("...............Recovered State:............");
		log.info(AccountAggregate.getAccount(ACCOUNT_OF_DAENERYS).toString());
		log.info(AccountAggregate.getAccount(ACCOUNT_OF_JON).toString());
	}
}
