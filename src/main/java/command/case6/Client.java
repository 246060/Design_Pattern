package command.case6;

import command.case6.ConcreteCommand.BuyStock;
import command.case6.ConcreteCommand.SellStock;
import command.case6.Invoker.Broker;
import command.case6.Receiver.Stock;

public class Client {

	public static void main(String[] args) {

		Stock abcStock = new Stock();
		Broker broker = new Broker();

		broker.takeOrder(new BuyStock(abcStock));
		broker.takeOrder(new SellStock(abcStock));

		broker.placeOrders();
	}
}
