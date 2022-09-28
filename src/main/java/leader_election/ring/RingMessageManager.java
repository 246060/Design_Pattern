package leader_election.ring;


import leader_election.manager.AbstractMessageManager;
import leader_election.instance.Instance;
import leader_election.Message;
import leader_election.MessageType;

import java.util.Map;


public class RingMessageManager extends AbstractMessageManager {

	public RingMessageManager(Map<Integer, Instance> instanceMap) {
		super(instanceMap);
	}

	/**
	 * Send heartbeat message to current leader instance to check the health.
	 *
	 * @param leaderId leaderID
	 * @return {@code true} if the leader is alive.
	 */
	@Override
	public boolean sendHeartbeatMessage(int leaderId) {
		var leaderInstance = instanceMap.get(leaderId);
		var alive = leaderInstance.isAlive();
		return alive;
	}

	/**
	 * Send election message to the next instance.
	 *
	 * @param currentId currentID
	 * @param content   list contains all the IDs of instances which have received this election message.
	 * @return {@code true} if the election message is accepted by the target instance.
	 */
	@Override
	public boolean sendElectionMessage(int currentId, String content) {
		var nextInstance = this.findNextInstance(currentId);
		var electionMessage = new Message(MessageType.ELECTION, content);
		nextInstance.onMessage(electionMessage);
		return true;
	}

	/**
	 * Send leader message to the next instance.
	 *
	 * @param currentId Instance ID of which sends this message.
	 * @param leaderId  Leader message content.
	 * @return {@code true} if the leader message is accepted by the target instance.
	 */
	@Override
	public boolean sendLeaderMessage(int currentId, int leaderId) {
		var nextInstance = this.findNextInstance(currentId);
		var leaderMessage = new Message(MessageType.LEADER, String.valueOf(leaderId));
		nextInstance.onMessage(leaderMessage);
		return true;
	}

	/**
	 * Send heartbeat invoke message to the next instance.
	 *
	 * @param currentId Instance ID of which sends this message.
	 */
	@Override
	public void sendHeartbeatInvokeMessage(int currentId) {
		var nextInstance = this.findNextInstance(currentId);
		var heartbeatInvokeMessage = new Message(MessageType.HEARTBEAT_INVOKE, "");
		nextInstance.onMessage(heartbeatInvokeMessage);
	}

}
