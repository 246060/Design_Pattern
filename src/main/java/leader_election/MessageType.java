package leader_election;


public enum MessageType {

	/**
	 * Start the election. The content of the message stores ID(s) of the candidate instance(s).
	 */
	ELECTION,

	/**
	 * Nodify the new leader. The content of the message should be the leader ID.
	 */
	LEADER,

	/**
	 * Check health of current leader instance.
	 */
	HEARTBEAT,

	/**
	 * Inform target instance to start election.
	 */
	ELECTION_INVOKE,

	/**
	 * Inform target instance to notify all the other instance that it is the new leader.
	 */
	LEADER_INVOKE,

	/**
	 * Inform target instance to start heartbeat.
	 */
	HEARTBEAT_INVOKE

}

