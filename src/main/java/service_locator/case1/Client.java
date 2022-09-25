package service_locator.case1;

import service_locator.case1.Service.Service;
import service_locator.case1.ServiceLocator.ServiceLocator;

public class Client {

	public static void main(String[] args) {

		Service service = null;

		service = ServiceLocator.getService("Service1");
		service.execute();

		service = ServiceLocator.getService("Service2");
		service.execute();

		service = ServiceLocator.getService("Service1");
		service.execute();

		service = ServiceLocator.getService("Service2");
		service.execute();
	}
}
