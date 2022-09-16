package decorator.case2.decorator;

import decorator.case2.LCD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorDemo extends Decorator {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public DecoratorDemo(LCD i) {
		super(i);
	}

	public void write(String[] s) {
		System.out.print("PASSWORD: ");

		try {
			in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		super.write(s);
	}

	public void read(String[] s) {
		System.out.print("PASSWORD: ");

		try {
			in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		super.read(s);
	}
}
