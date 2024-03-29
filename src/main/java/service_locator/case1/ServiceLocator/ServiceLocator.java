package service_locator.case1.ServiceLocator;

import service_locator.case1.Cache.Cache;
import service_locator.case1.Context.InitialContext;
import service_locator.case1.Service.Service;

public class ServiceLocator {

	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(String jndiName){

		Service service = cache.getService(jndiName);

		if(service != null){
			return service;
		}

		InitialContext context = new InitialContext();
		Service service1 = (Service)context.lookup(jndiName);
		cache.addService(service1);
		return service1;
	}
}
