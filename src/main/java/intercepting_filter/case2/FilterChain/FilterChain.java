package intercepting_filter.case2.FilterChain;


import intercepting_filter.case2.Filter.Filter;
import intercepting_filter.case2.Order;


public class FilterChain {

	private Filter chain;

	public void addFilter(Filter filter) {
		if (chain == null) {
			chain = filter;
		} else {
			chain.getLast().setNext(filter);
		}
	}

	public String execute(Order order) {
		if (chain != null) {
			return chain.execute(order);
		} else {
			return "RUNNING...";
		}
	}
}
