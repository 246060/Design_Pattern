package decorator.case2;

import decorator.case2.decorator.DecoratorDemo;
import decorator.case2.decorator.Scramble;

public class Client {


	public static void main(String[] args) {

		LCD stream = new DecoratorDemo(new Scramble(new Core()));
		String[] str = {""};

		stream.write(str);

		System.out.println("main:     " + str[0]);

		stream.read(str);
	}
}
