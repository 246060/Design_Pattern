package bridge.case2;

import bridge.case2.concrete_implementor.DataBaseRepository;
import bridge.case2.concrete_implementor.FileRepository;
import bridge.case2.refined_abstraction.StudentRepository;

public class Client {

	public static void main(String[] args) {

		// code to store in file
		StudentRepository fileRepositroy = new StudentRepository(new FileRepository());
		fileRepositroy.save(new Student());

		// code to store in DataBase
		StudentRepository dbRepositroy = new StudentRepository(new DataBaseRepository());
		dbRepositroy.save(new Student());
	}
}
