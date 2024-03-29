package chain_of_responsibility.case1.Handler;

import java.util.Random;

public class Handler {

	private final static Random RANDOM = new Random();
	private static int nextID = 1;
	private int id = nextID++;
	private Handler nextInChain;

	public void add(Handler next) {
		if (nextInChain == null) {
			nextInChain = next;
		} else {
			nextInChain.add(next);
		}
	}

	public void wrapAround(Handler root) {
		if (nextInChain == null) {
			nextInChain = root;
		} else {
			nextInChain.wrapAround(root);
		}
	}

	public void execute(int num) {
		if (RANDOM.nextInt(4) != 0) {
			System.out.println("   " + id + "-budy   ");
			nextInChain.execute(num);
		} else {
			System.out.println(id + "-handled-" + num);
		}
	}

}
