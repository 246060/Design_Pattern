package chain_of_responsibility.case7.ConcreteHandler;

import chain_of_responsibility.case7.Handler.SupportServiceItf;
import chain_of_responsibility.case7.ServiceRequest;

public class SupportService implements SupportServiceItf {

	private SupportServiceItf handler = null;

	public SupportServiceItf getHandler() {
		return handler;
	}

	public void setHandler(SupportServiceItf handler) {
		this.handler = handler;
	}

	@Override
	public void handleRequest(ServiceRequest request) {
		handler.handleRequest(request);
	}

}