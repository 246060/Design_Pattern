package intercepting_filter.case2;

import intercepting_filter.case2.Client.Client;
import intercepting_filter.case2.Filter.*;
import intercepting_filter.case2.FilterManager.FilterManager;

public class Main {

  public static void main(String[] args) {

    var filterManager = new FilterManager();

    filterManager.addFilter(new NameFilter());
    filterManager.addFilter(new ContactFilter());
    filterManager.addFilter(new AddressFilter());
    filterManager.addFilter(new DepositFilter());
    filterManager.addFilter(new OrderFilter());

    var client = new Client();
    client.setFilterManager(filterManager);
  }
}
