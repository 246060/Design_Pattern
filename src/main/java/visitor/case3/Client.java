package visitor.case3;

import visitor.case3.ConcreteElement.Document;
import visitor.case3.ConcreteElement.JsonElement;
import visitor.case3.ConcreteElement.XmlElement;
import visitor.case3.ConcreteVisitor.ElementVisitor;
import visitor.case3.visitor.Visitor;

import java.util.UUID;

public class Client {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------------------");

		Visitor v = new ElementVisitor();

		Document d = new Document(generateUuid());
		d.add(new JsonElement(generateUuid()));
		d.add(new JsonElement(generateUuid()));
		d.add(new XmlElement(generateUuid()));

		d.accept(v);
	}

	private static String generateUuid() {
		return UUID.randomUUID().toString();
	}
}
