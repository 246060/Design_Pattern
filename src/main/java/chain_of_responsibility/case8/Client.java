package chain_of_responsibility.case8;

import chain_of_responsibility.case8.ConcreteHandler.EarthHandler;
import chain_of_responsibility.case8.ConcreteHandler.MercuryHandler;
import chain_of_responsibility.case8.Handler.PlanetHandler;
import chain_of_responsibility.case8.ConcreteHandler.VenusHandler;

public class Client {

	public static PlanetHandler setUpChain() {

		PlanetHandler mercuryHandler = new MercuryHandler();
		PlanetHandler venusHandler = new VenusHandler();
		PlanetHandler earthHandler = new EarthHandler();

		mercuryHandler.setSuccessor(venusHandler);
		venusHandler.setSuccessor(earthHandler);

		return mercuryHandler;
	}

	public static void main(String[] args) {

		PlanetHandler chain = setUpChain();

		chain.handleRequest(PlanetEnum.VENUS);
		chain.handleRequest(PlanetEnum.MERCURY);
		chain.handleRequest(PlanetEnum.EARTH);
		chain.handleRequest(PlanetEnum.JUPITER);
	}
}
