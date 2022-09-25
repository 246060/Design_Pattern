package intercepting_filter.case1;

import intercepting_filter.case1.Client.Client;
import intercepting_filter.case1.Filter.AuthenticationFilter;
import intercepting_filter.case1.Filter.DebugFilter;
import intercepting_filter.case1.FilterManager.FilterManager;
import intercepting_filter.case1.Target.Target;

public class Main {

	public static void main(String[] args) {

		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");

	}
}
