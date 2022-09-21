package abstract_factory.case3;

import abstract_factory.case3.factory.ComputerFactory;
import abstract_factory.case3.factory.PCFactory;
import abstract_factory.case3.factory.ServerFactory;

public class Client {

	public static void main(String[] args) {

		// PCFactory 와 ServerFactory 멤버 변수가 변경되지 않는다면 싱글톤으로 해도 될 거 같다.
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

		System.out.println("AbstractFactory PC Config::" + pc);
		System.out.println("AbstractFactory Server Config::" + server);
	}
}
