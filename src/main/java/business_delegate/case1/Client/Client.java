package business_delegate.case1.Client;

import business_delegate.case1.BusinessDelegate.BusinessDelegate;

public class Client {

	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}
}
