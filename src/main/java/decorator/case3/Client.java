package decorator.case3;

import decorator.case3.Component_Implementation.FileDataSource;
import decorator.case3.Component_Interface.DataSource;
import decorator.case3.Concrete_Decorators.CompressionDecorator;
import decorator.case3.Decorator.DataSourceDecorator;
import decorator.case3.Concrete_Decorators.EncryptionDecorator;

public class Client {

	// https://refactoring.guru/design-patterns/decorator/java/example
	public static void main(String[] args) {

		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

		DataSource encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("OutputDemo.txt")));
		encoded.writeData(salaryRecords);

		DataSource plain = new FileDataSource("OutputDemo.txt");

		System.out.println("- Input ----------------");
		System.out.println(salaryRecords);

		System.out.println("- Encoded --------------");
		System.out.println(plain.readData());

		System.out.println("- Decoded --------------");
		System.out.println(encoded.readData());
	}
}
