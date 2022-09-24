package chain_of_responsibility.case8.ConcreteHandler;

import chain_of_responsibility.case8.Handler.PlanetHandler;
import chain_of_responsibility.case8.PlanetEnum;

public class EarthHandler extends PlanetHandler {

	public void handleRequest(PlanetEnum request) {

		if (request == PlanetEnum.EARTH) {
			System.out.println("EarthHandler handles " + request);
			System.out.println("Earth is comfortable.\n");

		} else {
			System.out.println("EarthHandler doesn't handle " + request);

			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}
