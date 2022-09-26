package service_locator.case2.Service;


import service_locator.case2.Service.Service;

/**
 * This is the actual service that will process the request.
 * The reference for this service is to be looked upon in the JNDI server
 * that can be set in the web.xml deployment descriptor
 */
public class ServiceImpl implements Service {

	private final String serviceName;
	private final int id;

	public ServiceImpl(String serviceName) {
		this.serviceName = serviceName;
		this.id = (int) Math.floor(Math.random() * 1000) + 1;
	}

	@Override
	public String getName() {
		return serviceName;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void execute() {
		System.out.println("Service " + getName() + " is now executing with id " + getId());
	}
}
