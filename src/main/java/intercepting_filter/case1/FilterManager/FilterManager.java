package intercepting_filter.case1.FilterManager;

import intercepting_filter.case1.Filter.Filter;
import intercepting_filter.case1.FilterChain.FilterChain;
import intercepting_filter.case1.Target.Target;

public class FilterManager {

	FilterChain filterChain;

	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	public void filterRequest(String request) {
		filterChain.execute(request);
	}
}
