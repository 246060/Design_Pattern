package chain_of_responsibility.case4.Handler;

public interface Handler<T> {
	void next(Handler handler);
	void process(T t);
	String getHandlerName();
}
