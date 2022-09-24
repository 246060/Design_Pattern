package chain_of_responsibility.case8.ConcreteHandler;

import chain_of_responsibility.case8.Handler.PlanetHandler;
import chain_of_responsibility.case8.PlanetEnum;

public class MercuryHandler extends PlanetHandler {

	public void handleRequest(PlanetEnum request) {

		if (request == PlanetEnum.MERCURY) {
			System.out.println("MercuryHandler handles " + request);
			System.out.println("Mercury is hot.\n");

		} else {
			System.out.println("MercuryHandler doesn't handle " + request);

			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}
