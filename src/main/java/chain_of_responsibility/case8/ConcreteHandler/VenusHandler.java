package chain_of_responsibility.case8.ConcreteHandler;

import chain_of_responsibility.case8.Handler.PlanetHandler;
import chain_of_responsibility.case8.PlanetEnum;

public class VenusHandler extends PlanetHandler {

	public void handleRequest(PlanetEnum request) {

		if (request == PlanetEnum.VENUS) {
			System.out.println("VenusHandler handles " + request);
			System.out.println("Venus is poisonous.\n");

		} else {
			System.out.println("VenusHandler doesn't handle " + request);

			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}
