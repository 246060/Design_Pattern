package service_locator.case2.ServiceLocator;

import service_locator.case2.Context.InitContext;
import service_locator.case2.Service.Service;
import service_locator.case2.Cache.ServiceCache;

public final class ServiceLocator {

	private static final ServiceCache serviceCache = new ServiceCache();

	private ServiceLocator() {
	}

	public static Service getService(String serviceJndiName) {

		var serviceObj = serviceCache.getService(serviceJndiName);
		if (serviceObj != null) {
			return serviceObj;
		}

		var ctx = new InitContext();
		serviceObj = (Service) ctx.lookup(serviceJndiName);

		if (serviceObj != null) {
			serviceCache.addService(serviceObj);
		}

		return serviceObj;
	}
}
