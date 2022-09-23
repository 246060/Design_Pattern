package command.case6.ConcreteCommand;

import command.case6.Command.Order;
import command.case6.Receiver.Stock;

public class BuyStock implements Order {

	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}
