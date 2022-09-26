package service_locator.case2.Cache;


import service_locator.case2.Service.Service;

import java.util.HashMap;
import java.util.Map;

public class ServiceCache {

	private final Map<String, Service> serviceCache;

	public ServiceCache() {
		serviceCache = new HashMap<>();
	}

	public Service getService(String serviceName) {

		if (serviceCache.containsKey(serviceName)) {
			var cachedService = serviceCache.get(serviceName);

			var name = cachedService.getName();
			var id = cachedService.getId();
			System.out.println("(cache call) Fetched service " + name + "(" + id + ") from cache... !");

			return cachedService;
		}
		return null;
	}

	public void addService(Service newService) {
		serviceCache.put(newService.getName(), newService);
	}
}
