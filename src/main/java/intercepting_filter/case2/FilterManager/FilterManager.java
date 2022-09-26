package intercepting_filter.case2.FilterManager;

import intercepting_filter.case2.Filter.Filter;
import intercepting_filter.case2.FilterChain.FilterChain;
import intercepting_filter.case2.Order;


public class FilterManager {

	private final FilterChain filterChain;

	public FilterManager() {
		filterChain = new FilterChain();
	}

	public void addFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	public String filterRequest(Order order) {
		return filterChain.execute(order);
	}
}
