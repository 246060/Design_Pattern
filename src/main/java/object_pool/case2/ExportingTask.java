package object_pool.case2;

import object_pool.case2.Reusable.ExportingProcess;
import object_pool.case2.ReusablePool.ObjectPool;

public class ExportingTask implements Runnable {

	private ObjectPool<ExportingProcess> pool;
	private int threadNo;

	public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo) {
		this.pool = pool;
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		ExportingProcess exportingProcess = pool.borrowObject();
		System.out.println("Thread " + threadNo + ": Object with process no. " + exportingProcess.getProcessNo() + " was borrowed");

		// you can  do something here in future

		pool.returnObject(exportingProcess);
		System.out.println("Thread " + threadNo + ": Object with process no. " + exportingProcess.getProcessNo() + " was returned");
	}
}
