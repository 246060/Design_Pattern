package service_locator.case2.Context;

import service_locator.case2.Service.ServiceImpl;

public class InitContext {

	public Object lookup(String serviceName) {

		if (serviceName.equals("jndi/serviceA")) {
			System.out.println("Looking up service A and creating new service for A");
			return new ServiceImpl("jndi/serviceA");

		} else if (serviceName.equals("jndi/serviceB")) {
			System.out.println("Looking up service B and creating new service for B");
			return new ServiceImpl("jndi/serviceB");

		} else {
			return null;
		}
	}
}
