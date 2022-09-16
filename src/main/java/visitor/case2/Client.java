package visitor.case2;

import visitor.case2.visitable.BAR;
import visitor.case2.visitable.BAZ;
import visitor.case2.visitable.Element;
import visitor.case2.visitable.FOO;
import visitor.case2.visitor.DownVisitor;
import visitor.case2.visitor.UpVisitor;

public class Client {

	public static void main(String[] args) {

		Element[] list = {new FOO(), new BAR(), new BAZ()};

		UpVisitor up = new UpVisitor();
		DownVisitor down = new DownVisitor();

		for (Element element : list) {
			element.accept(up);
		}

		for (Element element : list) {
			element.accept(down);
		}

	}
}
