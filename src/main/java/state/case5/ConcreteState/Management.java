package state.case5.ConcreteState;

import state.case5.AbstractState.Connection;

public class Management implements Connection {

	@Override
	public void open() {
		System.out.println("open database for Management");
	}

	@Override
	public void close() {
		System.out.println("close the database");
	}

	@Override
	public void log() {
		System.out.println("log activities");
	}

	@Override
	public void update() {
		System.out.println("Management has been updated");
	}

}
