package visitor.case5.ConcreteVisitor;

import visitor.case5.Element.NumberElement;
import visitor.case5.ConcreteElement.ThreeElement;
import visitor.case5.ConcreteElement.TwoElement;
import visitor.case5.visitor.NumberVisitor;

import java.util.List;

public class SumVisitor implements NumberVisitor {

	@Override
	public void visit(TwoElement twoElement) {
		int sum = twoElement.getA() + twoElement.getB();
		System.out.println(twoElement.getA() + "+" + twoElement.getB() + "=" + sum);
	}

	@Override
	public void visit(ThreeElement threeElement) {
		int sum = threeElement.getA() + threeElement.getB() + threeElement.getC();
		System.out.println(threeElement.getA() + "+" + threeElement.getB() + "+" + threeElement.getC() + "=" + sum);
	}

	@Override
	public void visit(List<NumberElement> elementList) {
		for (NumberElement ne : elementList) {
			ne.accept(this);
		}
	}

}
