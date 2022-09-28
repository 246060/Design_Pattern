package leader_election.instance;


import leader_election.Message;

public interface Instance {
  boolean isAlive();
  void setAlive(boolean alive);
  void onMessage(Message message);
}
