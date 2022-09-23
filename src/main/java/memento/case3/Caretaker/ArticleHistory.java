package memento.case3.Caretaker;

import memento.case3.Originator.Article;
import memento.case3.Memento.ArticleMemento;

import java.util.Stack;

public class ArticleHistory {

	Stack<ArticleMemento> history = new Stack<>();

	public void save(Article article) {
		history.push(article.save());
	}

	public void revert(Article article) {
		if (!history.isEmpty()) {
			article.revert(history.pop());
		} else {
			System.out.println("Cannot undo");
		}
	}
}
