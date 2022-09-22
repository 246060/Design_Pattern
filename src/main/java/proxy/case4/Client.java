package proxy.case4;

import proxy.case4.proxy.ProxyInternetAccess;
import proxy.case4.subject.OfficeInternetAccess;

public class Client {

	public static void main(String[] args) {

		OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
		access.grantInternetAccess();
	}
}
