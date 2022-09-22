package decorator.case2;

import decorator.case2.Component_Implementation.Core;
import decorator.case2.Component_Interface.LCD;
import decorator.case2.Concrete_Decorators.DecoratorDemo;
import decorator.case2.Concrete_Decorators.Scramble;

public class Client {


	public static void main(String[] args) {

		LCD stream = new DecoratorDemo(new Scramble(new Core()));
		String[] str = {""};

		stream.write(str);

		System.out.println("main:     " + str[0]);

		stream.read(str);
	}
}
