package business_delegate.case1.BusinessService;

public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}
