package Prototype.case5;


public class Client {

	public static void main(String[] args) {

		int eid = 1;
		String ename = "smile";
		String edesignation = "engineer";
		String eaddress = "seoul";
		double esalary = 30000;

		EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);
		e1.showRecord();

		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		e2.showRecord();

	}
}
