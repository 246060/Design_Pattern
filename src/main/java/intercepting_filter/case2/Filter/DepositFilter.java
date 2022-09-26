package intercepting_filter.case2.Filter;

import intercepting_filter.case2.Order;


public class DepositFilter extends AbstractFilter {

	@Override
	public String execute(Order order) {
		var result = super.execute(order);
		var depositNumber = order.getDepositNumber();

		if (depositNumber == null || depositNumber.isEmpty()) {
			return result + "Invalid deposit number! ";
		} else {
			return result;
		}
	}
}
