package state.case5.AbstractState;

public interface Connection {
	void open();
	void close();
	void log();
	void update();
}
