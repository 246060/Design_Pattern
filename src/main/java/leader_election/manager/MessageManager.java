package leader_election.manager;


public interface MessageManager {

  /**
   * Send heartbeat message to leader instance to check whether the leader instance is alive.
   *
   * @param leaderId Instance ID of leader instance.
   * @return {@code true} if leader instance is alive, or {@code false} if not.
   */
  boolean sendHeartbeatMessage(int leaderId);

  /**
   * Send election message to other instances.
   *
   * @param currentId Instance ID of which sends this message.
   * @param content   Election message content.
   * @return {@code true} if the message is accepted by the target instances.
   */
  boolean sendElectionMessage(int currentId, String content);

  /**
   * Send new leader notification message to other instances.
   *
   * @param currentId Instance ID of which sends this message.
   * @param leaderId  Leader message content.
   * @return {@code true} if the message is accepted by the target instances.
   */
  boolean sendLeaderMessage(int currentId, int leaderId);

  /**
   * Send heartbeat invoke message. This will invoke heartbeat task in the target instance.
   *
   * @param currentId Instance ID of which sends this message.
   */
  void sendHeartbeatInvokeMessage(int currentId);

}
