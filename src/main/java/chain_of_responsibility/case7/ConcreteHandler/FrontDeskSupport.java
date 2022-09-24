package chain_of_responsibility.case7.ConcreteHandler;

import chain_of_responsibility.case7.ServiceLevel;
import chain_of_responsibility.case7.ServiceRequest;
import chain_of_responsibility.case7.Handler.SupportServiceItf;

public class FrontDeskSupport implements SupportServiceItf {

	private SupportServiceItf next = null;

	public SupportServiceItf getNext() {
		return next;
	}

	public void setNext(SupportServiceItf next) {
		this.next = next;
	}

	@Override
	public void handleRequest(ServiceRequest service) {

		if (service.getType() == ServiceLevel.LEVEL_ONE) {
			service.setConclusion("Front desk solved level one reuqest !!");

		} else {

			if (next != null) {
				next.handleRequest(service);

			} else {
				throw new IllegalArgumentException("No handler found for :: " + service.getType());
			}
		}
	}
}
