package service_locator.case2;

import service_locator.case2.ServiceLocator.ServiceLocator;

public class Client {

	public static final String JNDI_SERVICE_A = "jndi/serviceA";
	public static final String JNDI_SERVICE_B = "jndi/serviceB";

	public static void main(String[] args) {

		var service = ServiceLocator.getService(JNDI_SERVICE_A);
		service.execute();

		service = ServiceLocator.getService(JNDI_SERVICE_B);
		service.execute();

		service = ServiceLocator.getService(JNDI_SERVICE_A);
		service.execute();

		service = ServiceLocator.getService(JNDI_SERVICE_A);
		service.execute();
	}

}
