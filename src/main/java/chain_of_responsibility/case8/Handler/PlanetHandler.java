package chain_of_responsibility.case8.Handler;

import chain_of_responsibility.case8.PlanetEnum;

public abstract class PlanetHandler {

	protected PlanetHandler successor;

	public void setSuccessor(PlanetHandler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(PlanetEnum request);
}
