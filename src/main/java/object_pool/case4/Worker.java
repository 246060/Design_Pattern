package object_pool.case4;


import object_pool.case4.Reusable.Task;

public class Worker implements Runnable {

	private final Task task;

	public Worker(final Task task) {
		this.task = task;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " processing " + task.toString());

		try {
			Thread.sleep(task.getTimeMs());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
