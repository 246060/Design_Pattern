package leader_election.bully;

import leader_election.manager.AbstractMessageManager;
import leader_election.instance.Instance;
import leader_election.Message;
import leader_election.MessageType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BullyMessageManager extends AbstractMessageManager {

	public BullyMessageManager(Map<Integer, Instance> instanceMap) {
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
	 * Send election message to all the instances with smaller ID.
	 *
	 * @param currentId Instance ID of which sends this message.
	 * @param content   Election message content.
	 * @return {@code true} if no alive instance has smaller ID, so that the election is accepted.
	 */
	@Override
	public boolean sendElectionMessage(int currentId, String content) {

		var candidateList = findElectionCandidateInstanceList(currentId);
		if (candidateList.isEmpty()) {
			return true;

		} else {
			var electionMessage = new Message(MessageType.ELECTION_INVOKE, "");
			candidateList.stream().forEach((i) -> instanceMap.get(i).onMessage(electionMessage));
			return false;
		}
	}

	/**
	 * Send leader message to all the instances to notify the new leader.
	 *
	 * @param currentId Instance ID of which sends this message.
	 * @param leaderId  Leader message content.
	 * @return {@code true} if the message is accepted.
	 */
	@Override
	public boolean sendLeaderMessage(int currentId, int leaderId) {
		var leaderMessage = new Message(MessageType.LEADER, String.valueOf(leaderId));

		instanceMap.keySet()
						.stream()
						.filter((i) -> i != currentId)
						.forEach((i) -> instanceMap.get(i).onMessage(leaderMessage));

		return false;
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

	/**
	 * Find all the alive instances with smaller ID than current instance.
	 *
	 * @param currentId ID of current instance.
	 * @return ID list of all the candidate instance.
	 */
	private List<Integer> findElectionCandidateInstanceList(int currentId) {
		return instanceMap.keySet()
						.stream()
						.filter((i) -> i < currentId && instanceMap.get(i).isAlive())
						.collect(Collectors.toList());
	}

}
