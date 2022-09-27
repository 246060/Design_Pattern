package visitor.case5.ConcreteElement;

import visitor.case5.Element.NumberElement;
import visitor.case5.visitor.NumberVisitor;

public class ThreeElement  implements NumberElement {

	int a;
	int b;
	int c;

	public ThreeElement(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void accept(NumberVisitor visitor) {
		visitor.visit(this);
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}
}
