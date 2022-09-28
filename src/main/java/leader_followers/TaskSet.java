package leader_followers;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * A TaskSet is a collection of the tasks, the leader receives task from here.
 */
public class TaskSet {

	private final BlockingQueue<Task> queue = new ArrayBlockingQueue<>(100);

	public void addTask(Task task) throws InterruptedException {
		queue.put(task);
	}

	public Task getTask() throws InterruptedException {
		return queue.take();
	}

	public int getSize() {
		return queue.size();
	}
}
