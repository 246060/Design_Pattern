package bridge.case6.concrete_implementor;

import bridge.case6.implementor.Question;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question {

	private List<String> questions = new ArrayList<>();
	private int current = 0;

	public JavaQuestions() {
		questions.add("What is class? ");
		questions.add("What is interface? ");
		questions.add("What is abstraction? ");
		questions.add("How multiple polymorphism is achieved in java? ");
		questions.add("How many types of exception  handling are there in java? ");
		questions.add("Define the keyword final for  variable, method, and class in java? ");
		questions.add("What is abstract class? ");
		questions.add("What is multi-threading? ");
	}


	@Override
	public void nextQuestion() {
		if (current <= questions.size() - 1)
			current++;
		System.out.print(current);
	}

	@Override
	public void previousQuestion() {
		if (current > 0)
			current--;
	}

	@Override
	public void newQuestion(String quest) {
		questions.add(quest);
	}

	@Override
	public void deleteQuestion(String quest) {
		questions.remove(quest);
	}

	@Override
	public void displayQuestion() {
		System.out.println(questions.get(current));
	}

	@Override
	public void displayAllQuestions() {
		for (String quest : questions) {
			System.out.println(quest);
		}
	}
}
