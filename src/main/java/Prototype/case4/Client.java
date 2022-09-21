package Prototype.case4;

import java.util.List;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employees emps = new Employees();
		emps.loadData();
		System.out.println("emps List: " + emps.getEmpList());

		//Use the clone method to get the Employee object
		Employees empsNew1 = (Employees) emps.clone();
		Employees empsNew2 = (Employees) emps.clone();

		List<String> empsNew1List = empsNew1.getEmpList();
		empsNew1List.add("John");
		System.out.println("empsNew1 List: " + empsNew1List);

		List<String> empsNew2List = empsNew2.getEmpList();
		empsNew2List.remove("Pankaj");
		System.out.println("empsNew2 List: " + empsNew2List);

	}
}
