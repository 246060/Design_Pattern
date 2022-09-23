package command.case6.ConcreteCommand;

import command.case6.Command.Order;
import command.case6.Receiver.Stock;

public class SellStock implements Order {

	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
