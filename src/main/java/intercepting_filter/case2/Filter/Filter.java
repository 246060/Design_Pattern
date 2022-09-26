package intercepting_filter.case2.Filter;

import intercepting_filter.case2.Order;

public interface Filter {
  String execute(Order order);
  void setNext(Filter filter);
  Filter getNext();
  Filter getLast();
}
