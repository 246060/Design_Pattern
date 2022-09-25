package business_delegate.case1.LookUpService;

import business_delegate.case1.BusinessService.BusinessService;
import business_delegate.case1.BusinessService.EJBService;
import business_delegate.case1.BusinessService.JMSService;

public class BusinessLookUp {

	public BusinessService getBusinessService(String serviceType) {

		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
