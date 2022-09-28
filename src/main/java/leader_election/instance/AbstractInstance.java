package leader_election.instance;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import leader_election.Message;
import leader_election.manager.MessageManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractInstance implements Instance, Runnable {

	protected static final int HEARTBEAT_INTERVAL = 5000;
	private static final String INSTANCE = "Instance ";

	protected MessageManager messageManager;
	protected Queue<Message> messageQueue;
	protected final int localId;
	protected int leaderId;
	protected boolean alive;

	public AbstractInstance(MessageManager messageManager, int localId, int leaderId) {
		this.messageManager = messageManager;
		this.messageQueue = new ConcurrentLinkedQueue<>();
		this.localId = localId;
		this.leaderId = leaderId;
		this.alive = true;
	}

	/**
	 * The instance will execute the message in its message queue periodically once it is alive.
	 */
	@Override
	public void run() {
		while (true) {
			if (!this.messageQueue.isEmpty()) {
				this.processMessage(this.messageQueue.remove());
			}
		}
	}

	/**
	 * Once messages are sent to the certain instance, it will firstly be added to the queue and wait to be executed.
	 *
	 * @param message Message sent by other instances
	 */
	@Override
	public void onMessage(Message message) {
		messageQueue.offer(message);
	}

	@Override
	public boolean isAlive() {
		return alive;
	}

	@Override
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	/**
	 * Process the message according to its type.
	 *
	 * @param message Message polled from queue.
	 */
	private void processMessage(Message message) {
		switch (message.getType()) {
			case ELECTION:
				log.info(INSTANCE + localId + " - Election Message handling...");
				handleElectionMessage(message);
				break;
			case LEADER:
				log.info(INSTANCE + localId + " - Leader Message handling...");
				handleLeaderMessage(message);
				break;
			case HEARTBEAT:
				log.info(INSTANCE + localId + " - Heartbeat Message handling...");
				handleHeartbeatMessage(message);
				break;
			case ELECTION_INVOKE:
				log.info(INSTANCE + localId + " - Election Invoke Message handling...");
				handleElectionInvokeMessage();
				break;
			case LEADER_INVOKE:
				log.info(INSTANCE + localId + " - Leader Invoke Message handling...");
				handleLeaderInvokeMessage();
				break;
			case HEARTBEAT_INVOKE:
				log.info(INSTANCE + localId + " - Heartbeat Invoke Message handling...");
				handleHeartbeatInvokeMessage();
				break;
			default:
				break;
		}
	}

	/**
	 * Abstract methods to handle different types of message.
	 * These methods need to be implemented in concrete instance class to implement corresponding leader-selection pattern.
	 */
	protected abstract void handleElectionMessage(Message message);
	protected abstract void handleElectionInvokeMessage();
	protected abstract void handleLeaderMessage(Message message);
	protected abstract void handleLeaderInvokeMessage();
	protected abstract void handleHeartbeatMessage(Message message);
	protected abstract void handleHeartbeatInvokeMessage();
}
