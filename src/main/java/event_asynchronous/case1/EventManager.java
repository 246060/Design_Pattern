package event_asynchronous.case1;

import event_asynchronous.case1.exception.EventDoesNotExistException;
import event_asynchronous.case1.exception.InvalidOperationException;
import event_asynchronous.case1.exception.LongRunningEventException;
import event_asynchronous.case1.exception.MaxNumOfEventsAllowedException;

import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * EventManager 는 이벤트 스레드 풀을 처리하고 유지합니다.
 * 스레드는 사용자 요청에 따라 생성됩니다.
 * 두 가지 유형의 이벤트가 있습니다. 비동기 및 동기.
 * 한 번에 여러 비동기 이벤트가 실행될 수 있지만 한 번에 하나의 동기 이벤트만 실행됩니다.
 * 현재 지원되는 이벤트 작업은 start, stop 및 getStatus 입니다.
 * 이벤트가 완료되면 리스너를 통해 EventManager 에 알립니다. 그런 다음 EventManager 는 풀에서 이벤트를 가져옵니다.
 */
public class EventManager implements ThreadCompleteListener {

	public static final int MAX_RUNNING_EVENTS = 1000;
	public static final int MIN_ID = 1;
	public static final int MAX_ID = MAX_RUNNING_EVENTS;
	public static final int MAX_EVENT_TIME = 1800; // in seconds / 30 minutes.

	private int currentlyRunningSyncEvent = -1;

	private final SecureRandom rand;
	private final Map<Integer, Event> eventPool;

	private static final String DOES_NOT_EXIST = " does not exist.";

	public EventManager() {
		rand = new SecureRandom();
		eventPool = new ConcurrentHashMap<>(MAX_RUNNING_EVENTS);
	}

	/**
	 * Create a Synchronous event.
	 *
	 * @param eventTime Time an event should run for.
	 * @return eventId
	 * @throws MaxNumOfEventsAllowedException When too many events are running at a time.
	 * @throws InvalidOperationException      No new synchronous events can be created when one is already running.
	 * @throws LongRunningEventException      Long running events are not allowed in the app.
	 */
	public int create(int eventTime) throws MaxNumOfEventsAllowedException, InvalidOperationException, LongRunningEventException {
		if (currentlyRunningSyncEvent != -1) {
			throw new InvalidOperationException("Event [" + currentlyRunningSyncEvent + "] is still" + " running. Please wait until it finishes and try again.");
		}

		var eventId = createEvent(eventTime, true);
		currentlyRunningSyncEvent = eventId;

		return eventId;
	}

	/**
	 * Create an Asynchronous event.
	 *
	 * @param eventTime Time an event should run for.
	 * @return eventId
	 * @throws MaxNumOfEventsAllowedException When too many events are running at a time.
	 * @throws LongRunningEventException      Long running events are not allowed in the app.
	 */
	public int createAsync(int eventTime) throws MaxNumOfEventsAllowedException, LongRunningEventException {
		return createEvent(eventTime, false);
	}

	private int createEvent(int eventTime, boolean isSynchronous) throws MaxNumOfEventsAllowedException, LongRunningEventException {

		if (eventPool.size() == MAX_RUNNING_EVENTS) {
			throw new MaxNumOfEventsAllowedException("Too many events are running at the moment. Please try again later.");
		}

		if (eventTime >= MAX_EVENT_TIME) {
			throw new LongRunningEventException("Maximum event time allowed is " + MAX_EVENT_TIME + " seconds. Please try again.");
		}

		var newEventId = generateId();

		var newEvent = new Event(newEventId, eventTime, isSynchronous);
		newEvent.addListener(this);
		eventPool.put(newEventId, newEvent);

		return newEventId;
	}

	/**
	 * Starts event.
	 */
	public void start(int eventId) throws EventDoesNotExistException {
		if (!eventPool.containsKey(eventId)) {
			throw new EventDoesNotExistException(eventId + DOES_NOT_EXIST);
		}
		eventPool.get(eventId).start();
	}

	/**
	 * Stops event.
	 */
	public void cancel(int eventId) throws EventDoesNotExistException {

		if (!eventPool.containsKey(eventId)) {
			throw new EventDoesNotExistException(eventId + DOES_NOT_EXIST);
		}

		if (eventId == currentlyRunningSyncEvent) {
			currentlyRunningSyncEvent = -1;
		}

		eventPool.get(eventId).stop();
		eventPool.remove(eventId);
	}

	/**
	 * Get status of a running event.
	 */
	public void status(int eventId) throws EventDoesNotExistException {
		if (!eventPool.containsKey(eventId)) {
			throw new EventDoesNotExistException(eventId + DOES_NOT_EXIST);
		}
		eventPool.get(eventId).status();
	}

	/**
	 * Gets status of all running events.
	 */
	@SuppressWarnings("rawtypes")
	public void statusOfAllEvents() {
		eventPool.entrySet().forEach(entry -> ((Event) ((Map.Entry) entry).getValue()).status());
	}

	/**
	 * Stop all running events.
	 */
	@SuppressWarnings("rawtypes")
	public void shutdown() {
		eventPool.entrySet().forEach(entry -> ((Event) ((Map.Entry) entry).getValue()).stop());
	}

	/**
	 * Returns a pseudo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 */
	private int generateId() {

		// nextInt is normally exclusive of the top value, so add 1 to make it inclusive
		var randomNum = rand.nextInt((MAX_ID - MIN_ID) + 1) + MIN_ID;
		while (eventPool.containsKey(randomNum)) {
			randomNum = rand.nextInt((MAX_ID - MIN_ID) + 1) + MIN_ID;
		}

		return randomNum;
	}

	/**
	 * Callback from an {@link Event} (once it is complete). The Event is then removed from the pool.
	 */
	@Override
	public void completedEventHandler(int eventId) {
		eventPool.get(eventId).status();
		if (eventPool.get(eventId).isSynchronous()) {
			currentlyRunningSyncEvent = -1;
		}
		eventPool.remove(eventId);
	}


	public Map<Integer, Event> getEventPool() {
		return eventPool;
	}

	/**
	 * Get number of currently running Synchronous events.
	 */
	public int numOfCurrentlyRunningSyncEvent() {
		return currentlyRunningSyncEvent;
	}
}
