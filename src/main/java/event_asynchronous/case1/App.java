package event_asynchronous.case1;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import event_asynchronous.case1.exception.EventDoesNotExistException;
import event_asynchronous.case1.exception.InvalidOperationException;
import event_asynchronous.case1.exception.LongRunningEventException;
import event_asynchronous.case1.exception.MaxNumOfEventsAllowedException;
import lombok.extern.slf4j.Slf4j;

/**
 * This application demonstrates the Event-based Asynchronous pattern.
 * Essentially, users (of the pattern) may choose to run events in an Asynchronous or Synchronous mode.
 * There can be multiple Asynchronous events running at once but only one Synchronous event can run at a time.
 * The key point here is that the threads run in the background and the user is free to carry on with other processes.
 * Once an event is complete, the appropriate listener/callback method will be called.
 * The listener then proceeds to carry out further processing depending on the needs of the user.
 */
@Slf4j
public class App {

	public static final String PROP_FILE_NAME = "config.properties";
	boolean interactiveMode = false;

	public static void main(String[] args) {
		var app = new App();
		app.setUp();
		app.run();
	}

	/**
	 * App can run in interactive mode or not. Interactive mode == Allow user interaction with command line.
	 * Non-interactive is a quick sequential run through the available EventManager operations.
	 */
	public void setUp() {
		var prop = new Properties();
		var inputStream = App.class.getClassLoader().getResourceAsStream(PROP_FILE_NAME);
		if (inputStream != null) {

			try {
				prop.load(inputStream);
			} catch (IOException e) {
				log.error("{} was not found. Defaulting to non-interactive mode.", PROP_FILE_NAME, e);
			}

			var property = prop.getProperty("INTERACTIVE_MODE");
			if (property.equalsIgnoreCase("YES")) {
				interactiveMode = true;
			}
		}
	}

	/**
	 * Run program in either interactive mode or not.
	 */
	public void run() {
		if (interactiveMode) {
			runInteractiveMode();
		} else {
			quickRun();
		}
	}

	/**
	 * Run program in non-interactive mode.
	 */
	public void quickRun() {
		var eventManager = new EventManager();

		try {
			// Create an Asynchronous event.
			var asyncEventId = eventManager.createAsync(60);
			log.info("Async Event [{}] has been created.", asyncEventId);

			eventManager.start(asyncEventId);
			log.info("Async Event [{}] has been started.", asyncEventId);

			// Create a Synchronous event.
			var syncEventId = eventManager.create(60);
			log.info("Sync Event [{}] has been created.", syncEventId);

			eventManager.start(syncEventId);
			log.info("Sync Event [{}] has been started.", syncEventId);

			eventManager.status(asyncEventId);
			eventManager.status(syncEventId);

			eventManager.cancel(asyncEventId);
			log.info("Async Event [{}] has been stopped.", asyncEventId);

			eventManager.cancel(syncEventId);
			log.info("Sync Event [{}] has been stopped.", syncEventId);

		} catch (MaxNumOfEventsAllowedException | LongRunningEventException | EventDoesNotExistException
						| InvalidOperationException e) {
			log.error(e.getMessage());
		}
	}

	/**
	 * Run program in interactive mode.
	 */
	public void runInteractiveMode() {
		var eventManager = new EventManager();

		var s = new Scanner(System.in);

		var option = -1;
		while (option != 4) {

			log.info("Hello. Would you like to boil some eggs?");
			log.info("(1) BOIL AN EGG \n(2) STOP BOILING THIS EGG \n(3) HOW ARE MY EGGS? \n(4) EXIT");
			log.info("Choose [1,2,3,4]: ");
			option = s.nextInt();

			if (option == 1) {
				processOption1(eventManager, s);

			} else if (option == 2) {
				processOption2(eventManager, s);

			} else if (option == 3) {
				processOption3(eventManager, s);

			} else if (option == 4) {
				eventManager.shutdown();
			}
		}

		s.close();
	}

	private void processOption3(EventManager eventManager, Scanner s) {
		s.nextLine();

		log.info("Just one egg (O) OR all of them (A) ?: ");
		var eggChoice = s.nextLine();

		if (eggChoice.equalsIgnoreCase("O")) {

			log.info("Which egg?: ");
			int eventId = s.nextInt();

			try {
				eventManager.status(eventId);
			} catch (EventDoesNotExistException e) {
				log.error(e.getMessage());
			}

		} else if (eggChoice.equalsIgnoreCase("A")) {
			eventManager.statusOfAllEvents();
		}
	}

	private void processOption2(EventManager eventManager, Scanner s) {
		log.info("Which egg?: ");
		var eventId = s.nextInt();

		try {
			eventManager.cancel(eventId);
			log.info("Egg [{}] is removed from boiler.", eventId);

		} catch (EventDoesNotExistException e) {
			log.error(e.getMessage());
		}
	}

	private void processOption1(EventManager eventManager, Scanner s) {
		s.nextLine();

		log.info("Boil multiple eggs at once (A) or boil them one-by-one (S)?: ");
		var eventType = s.nextLine();

		log.info("How long should this egg be boiled for (in seconds)?: ");
		var eventTime = s.nextInt();

		if (eventType.equalsIgnoreCase("A")) {

			try {
				var eventId = eventManager.createAsync(eventTime);
				eventManager.start(eventId);
				log.info("Egg [{}] is being boiled.", eventId);

			} catch (MaxNumOfEventsAllowedException | LongRunningEventException | EventDoesNotExistException e) {
				log.error(e.getMessage());
			}

		} else if (eventType.equalsIgnoreCase("S")) {

			try {
				var eventId = eventManager.create(eventTime);
				eventManager.start(eventId);
				log.info("Egg [{}] is being boiled.", eventId);

			} catch (MaxNumOfEventsAllowedException | InvalidOperationException | LongRunningEventException | EventDoesNotExistException e) {
				log.error(e.getMessage());
			}

		} else {
			log.info("Unknown event type.");
		}
	}

}
