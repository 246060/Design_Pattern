package leader_election.bully;

import leader_election.instance.Instance;
import leader_election.Message;
import leader_election.MessageType;

import java.util.HashMap;
import java.util.Map;

/**
 * Example of how to use bully leader election.
 * Initially 5 instances is created in the clould system, and the instance with ID 1 is set as leader.
 * After the system is started stop the leader instance, and the new leader will be elected.
 */
public class BullyApp {

  public static void main(String[] args) {

    Map<Integer, Instance> instanceMap = new HashMap<>();
    var messageManager = new BullyMessageManager(instanceMap);

    var instance1 = new BullyInstance(messageManager, 1, 1);
    var instance2 = new BullyInstance(messageManager, 2, 1);
    var instance3 = new BullyInstance(messageManager, 3, 1);
    var instance4 = new BullyInstance(messageManager, 4, 1);
    var instance5 = new BullyInstance(messageManager, 5, 1);

    instanceMap.put(1, instance1);
    instanceMap.put(2, instance2);
    instanceMap.put(3, instance3);
    instanceMap.put(4, instance4);
    instanceMap.put(5, instance5);

    instance4.onMessage(new Message(MessageType.HEARTBEAT_INVOKE, ""));

    final var thread1 = new Thread(instance1);
    final var thread2 = new Thread(instance2);
    final var thread3 = new Thread(instance3);
    final var thread4 = new Thread(instance4);
    final var thread5 = new Thread(instance5);

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();

    instance1.setAlive(false);
  }
}
