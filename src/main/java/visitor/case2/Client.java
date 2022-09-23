package visitor.case2;

import visitor.case2.ConcreteElement.BAR;
import visitor.case2.ConcreteElement.BAZ;
import visitor.case2.ConcreteElement.FOO;
import visitor.case2.ConcreteVisitor.DownVisitor;
import visitor.case2.ConcreteVisitor.UpVisitor;
import visitor.case2.Element.Element;

public class Client {

	public static void main(String[] args) {
		Element[] list = {new FOO(), new BAR(), new BAZ()};

		System.out.println("----------------------------");

		// UpVisitor
		UpVisitor up = new UpVisitor();
		for (Element element : list) {
			element.accept(up);
		}

		System.out.println("----------------------------");

		// DownVisitor
		DownVisitor down = new DownVisitor();
		for (Element element : list) {
			element.accept(down);
		}

	}
}
