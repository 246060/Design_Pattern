package visitor.case5.ConcreteVisitor;

import visitor.case5.Element.NumberElement;
import visitor.case5.ConcreteElement.ThreeElement;
import visitor.case5.ConcreteElement.TwoElement;
import visitor.case5.visitor.NumberVisitor;

import java.util.List;

public class TotalSumVisitor implements NumberVisitor {

	int totalSum = 0;

	@Override
	public void visit(TwoElement twoElement) {
		int sum = twoElement.getA() + twoElement.getB();
		System.out.println("Adding " + twoElement.getA() + "+" + twoElement.getB() + "=" + sum + " to total");
		totalSum += sum;
	}

	@Override
	public void visit(ThreeElement threeElement) {
		int sum = threeElement.getA() + threeElement.getB() + threeElement.getC();
		System.out.println("Adding " + threeElement.getA() + "+" + threeElement.getB() + "+" + threeElement.getC() + "=" + sum + " to total");
		totalSum += sum;
	}

	@Override
	public void visit(List<NumberElement> elementList) {
		for (NumberElement ne : elementList) {
			ne.accept(this);
		}
	}

	public int getTotalSum() {
		return totalSum;
	}

}
