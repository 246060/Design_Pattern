package leader_election.ring;

import leader_election.instance.AbstractInstance;
import leader_election.Message;
import leader_election.manager.MessageManager;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Implementation with token ring algorithm. The instances in the system are organized as a ring.
 * Each instance should have a sequential id and the instance with smallest (or largest) id should
 * be the initial leader. All the other instances send heartbeat message to leader periodically to
 * check its health. If one certain instance finds the server done, it will send an election message
 * to the next alive instance in the ring, which contains its own ID. Then the next instance add its
 * ID into the message and pass it to the next. After all the alive instances' ID are add to the
 * message, the message is send back to the first instance and it will choose the instance with
 * smallest ID to be the new leader, and then send a leader message to other instances to inform the
 * result.
 */
@Slf4j
public class RingInstance extends AbstractInstance {

	private static final String INSTANCE = "Instance ";

	public RingInstance(MessageManager messageManager, int localId, int leaderId) {
		super(messageManager, localId, leaderId);
	}

	/**
	 * Process the heartbeat invoke message. After receiving the message, the instance will send a
	 * heartbeat to leader to check its health. If alive, it will inform the next instance to do the
	 * heartbeat. If not, it will start the election process.
	 */
	@Override
	protected void handleHeartbeatInvokeMessage() {
		try {
			var isLeaderAlive = messageManager.sendHeartbeatMessage(this.leaderId);

			if (isLeaderAlive) {
				log.info(INSTANCE + localId + "- Leader is alive. Start next heartbeat in 5 second.");
				Thread.sleep(HEARTBEAT_INTERVAL);

				messageManager.sendHeartbeatInvokeMessage(this.localId);

			} else {
				log.info(INSTANCE + localId + "- Leader is not alive. Start election.");

				messageManager.sendElectionMessage(this.localId, String.valueOf(this.localId));
			}

		} catch (InterruptedException e) {
			log.info(INSTANCE + localId + "- Interrupted.");
		}
	}

	/**
	 * Process election message. If the local ID is contained in the ID list, the instance will select
	 * the alive instance with smallest ID to be the new leader, and send the leader inform message.
	 * If not, it will add its local ID to the list and send the message to the next instance in the
	 * ring.
	 */
	@Override
	protected void handleElectionMessage(Message message) {
		var content = message.getContent();
		log.info(INSTANCE + localId + " - Election Message: " + content);

		var candidateList = Arrays.stream(content.trim().split(","))
						.map(Integer::valueOf)
						.sorted()
						.collect(Collectors.toList());

		if (candidateList.contains(localId)) {
			var newLeaderId = candidateList.get(0);
			log.info(INSTANCE + localId + " - New leader should be " + newLeaderId + ".");

			messageManager.sendLeaderMessage(localId, newLeaderId);

		} else {
			content += "," + localId;
			messageManager.sendElectionMessage(localId, content);
		}
	}

	/**
	 * Process leader Message. The instance will set the leader ID to be the new one and send the
	 * message to the next instance until all the alive instance in the ring is informed.
	 */
	@Override
	protected void handleLeaderMessage(Message message) {

		var newLeaderId = Integer.valueOf(message.getContent());

		if (this.leaderId != newLeaderId) {
			log.info(INSTANCE + localId + " - Update leaderID");
			this.leaderId = newLeaderId;

			messageManager.sendLeaderMessage(localId, newLeaderId);

		} else {
			log.info(INSTANCE + localId + " - Leader update done. Start heartbeat.");
			messageManager.sendHeartbeatInvokeMessage(localId);
		}
	}

	/**
	 * Not used in Ring instance.
	 */
	@Override
	protected void handleLeaderInvokeMessage() {
		// Not used in Ring instance.
	}

	@Override
	protected void handleHeartbeatMessage(Message message) {
		// Not used in Ring instance.
	}

	@Override
	protected void handleElectionInvokeMessage() {
		// Not used in Ring instance.
	}

}
