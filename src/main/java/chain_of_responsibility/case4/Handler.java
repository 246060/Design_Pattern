package chain_of_responsibility.case4;

public interface Handler<T> {
    void next(Handler handler);
    void process(T t);
    String getHandlerName();
}
