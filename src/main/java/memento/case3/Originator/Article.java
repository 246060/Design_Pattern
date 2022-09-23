package memento.case3.Originator;

import memento.case3.Memento.ArticleMemento;

public class Article {

	private long id;
	private String title;
	private String content;

	public Article(long id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public ArticleMemento save() {
		return new ArticleMemento(getContent());
	}

	public void revert(ArticleMemento state) {
		content = state.getContent();
	}

	@Override
	public String toString() {
		return "Article{" + "id=" + id + ", title='" + title + '\'' + ", content='" + content + '\'' + '}';
	}
}
