package chain_of_responsibility.case7.Handler;

import chain_of_responsibility.case7.ServiceRequest;

public interface SupportServiceItf {

	void handleRequest(ServiceRequest request);
}
