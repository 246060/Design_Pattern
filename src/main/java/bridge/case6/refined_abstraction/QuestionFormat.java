package bridge.case6.refined_abstraction;

import bridge.case6.abstraction.QuestionManager;
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
