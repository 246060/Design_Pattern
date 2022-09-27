package state.case5;

import state.case5.Context.DeliveryContext;

public class Client {

	public static void main(String[] args) {

		DeliveryContext ctx = new DeliveryContext(null, "Test123");

		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
	}
}
