package proxy.case4.real_subject;

import proxy.case4.subject.OfficeInternetAccess;

public class RealInternetAccess implements OfficeInternetAccess {

	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: " + employeeName);
	}
}