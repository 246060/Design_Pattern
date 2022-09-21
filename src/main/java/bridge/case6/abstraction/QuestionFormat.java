package bridge.case6.abstraction;

import bridge.case6.implementor.Question;

public class QuestionFormat extends QuestionManager {

	public QuestionFormat(String catalog, Question q) {
		super(catalog, q);
	}

	public void displayAll() {
		System.out.println("\n---------------------------------------------------------");
		super.displayAll();
		System.out.println("-----------------------------------------------------------");
	}


}
