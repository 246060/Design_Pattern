package intercepting_filter.case1.Client;

import intercepting_filter.case1.FilterManager.FilterManager;

public class Client {

	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}

}
