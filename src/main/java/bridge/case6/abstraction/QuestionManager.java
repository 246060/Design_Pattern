package bridge.case6.abstraction;

import bridge.case6.implementor.Question;

public class QuestionManager {

	protected Question q;
	public String catalog;

	public QuestionManager(String catalog, Question q) {
		this.catalog = catalog;
		this.q = q;
	}

	public void next() {
		q.nextQuestion();
	}

	public void previous() {
		q.previousQuestion();
	}

	public void newOne(String quest) {
		q.newQuestion(quest);
	}

	public void delete(String quest) {
		q.deleteQuestion(quest);
	}

	public void display() {
		q.displayQuestion();
	}

	public void displayAll() {
		System.out.println("Question Paper: " + catalog);
		q.displayAllQuestions();
	}

}
