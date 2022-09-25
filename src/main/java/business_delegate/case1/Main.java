package business_delegate.case1;

import business_delegate.case1.BusinessDelegate.BusinessDelegate;
import business_delegate.case1.Client.Client;

public class Main {

	public static void main(String[] args) {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}
