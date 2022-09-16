package visitor.case4;

import visitor.case4.visitable.Computer;
import visitor.case4.visitable.ComputerPart;
import visitor.case4.visitor.ComputerPartDisplayVisitor;

public class Client {

	// https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
