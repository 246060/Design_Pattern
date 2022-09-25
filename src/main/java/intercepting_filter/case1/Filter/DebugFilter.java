package intercepting_filter.case1.Filter;


public class DebugFilter implements Filter {

	public void execute(String request) {
		System.out.println("request log: " + request);
	}
}
