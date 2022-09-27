package visitor.case5;

import visitor.case5.ConcreteElement.ThreeElement;
import visitor.case5.ConcreteElement.TwoElement;
import visitor.case5.ConcreteVisitor.SumVisitor;
import visitor.case5.ConcreteVisitor.TotalSumVisitor;
import visitor.case5.Element.NumberElement;
import visitor.case5.visitor.NumberVisitor;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<NumberElement> numberElements = List.of(
						new TwoElement(3, 3),
						new TwoElement(2, 7),
						new ThreeElement(3, 4, 5)
		);

		System.out.println("Visiting element list with SumVisitor");

		NumberVisitor sumVisitor = new SumVisitor();
		sumVisitor.visit(numberElements);


		System.out.println("\nVisiting element list with TotalSumVisitor");

		TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
		totalSumVisitor.visit(numberElements);

		System.out.println("Total sum:" + totalSumVisitor.getTotalSum());

	}
}
