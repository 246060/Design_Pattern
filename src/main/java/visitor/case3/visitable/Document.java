package visitor.case3.visitable;

import visitor.case3.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {

	private List<Element> elements = new ArrayList<>();

	public Document(String uuid) {
		super(uuid);
	}

	@Override
	public void accept(Visitor v) {
		for (Element element : this.elements) {
			element.accept(v);
		}
	}

	public void add(Element element) {
		this.elements.add(element);
	}
}
