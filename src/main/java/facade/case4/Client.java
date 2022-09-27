package facade.case4;

import facade.case4.facade.Facade;

public class Client {

	public static void main(String[] args) {

		Facade facade = new Facade();

		int x = 3;
		System.out.println("Cube of " + x + ":" + facade.cubeX(3));
		System.out.println("Cube of " + x + " times 2:" + facade.cubeXTimes2(3));
		System.out.println(x + " to sixth power times 2:" + facade.xToSixthPowerTimes2(3));
	}
}
