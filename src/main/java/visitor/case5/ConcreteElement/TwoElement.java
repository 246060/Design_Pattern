package visitor.case5.ConcreteElement;

import visitor.case5.Element.NumberElement;
import visitor.case5.visitor.NumberVisitor;

public class TwoElement implements NumberElement {

	int a;
	int b;

	public TwoElement(int a, int b) {
		this.a = a;
		this.b = b;
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
}
