package object_pool.case4;

import object_pool.case4.Reusable.CoffeeMakingTask;
import object_pool.case4.Reusable.PotatoPeelingTask;

import java.util.List;
import java.util.concurrent.Executors;


/**
 * 스레드 풀 패턴은 일반적으로 대기열에 구성되는 여러 작업을 수행하기 위해 여러 스레드가 생성되는 곳입니다.
 * 실행 중인 작업의 결과도 배치될 수 있습니다. 또는 작업이 결과를 반환하지 않을 수 있습니다.
 * 일반적으로 스레드보다 많은 작업이 있습니다.
 * 스레드가 작업을 완료하자마자 모든 작업이 완료될 때까지 대기열에서 다음 작업을 요청합니다.
 * 그런 다음 스레드는 사용 가능한 새 작업이 있을 때까지 종료하거나 휴면할 수 있습니다.
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("Program started");

		// Create a list of tasks to be executed
		var tasks = List.of(
						new PotatoPeelingTask(3),
						new PotatoPeelingTask(6),
						new CoffeeMakingTask(2),
						new CoffeeMakingTask(6),
						new PotatoPeelingTask(4),
						new CoffeeMakingTask(2),
						new PotatoPeelingTask(4),
						new CoffeeMakingTask(9),
						new PotatoPeelingTask(3),
						new CoffeeMakingTask(2),
						new PotatoPeelingTask(4),
						new CoffeeMakingTask(2),
						new CoffeeMakingTask(7),
						new PotatoPeelingTask(4),
						new PotatoPeelingTask(5)
		);


		// Creates a thread pool that reuses a fixed number of threads operating off a shared
		// unbounded queue. At any point, at most nThreads threads will be active processing
		// tasks. If additional tasks are submitted when all threads are active, they will wait
		// in the queue until a thread is available.
		var executor = Executors.newFixedThreadPool(3);

		// Allocate new worker for each task The worker is executed when a thread becomes available in the thread pool
		tasks.stream().map(Worker::new).forEach(executor::execute);

		// All tasks were executed, now shutdown
		executor.shutdown();

		while (!executor.isTerminated()) {
			Thread.yield();
		}

		System.out.println("Program finished");
	}
}
