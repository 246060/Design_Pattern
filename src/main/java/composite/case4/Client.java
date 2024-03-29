package composite.case4;

import composite.case4.composite.Column;
import composite.case4.composite.Composite;
import composite.case4.composite.Row;
import composite.case4.leaf.Primitive;

public class Client {

	// https://sourcemaking.com/design_patterns/composite/java/3
	public static void main(String[] args) {

		Composite first = new Row(1);
		Composite second = new Column(2);
		Composite third = new Column(3);
		Composite fourth = new Row(4);
		Composite fifth = new Row(5);

		first.add(second);
		first.add(third);
		third.add(fourth);
		third.add(fifth);

		first.add(new Primitive(6));
		second.add(new Primitive(7));
		third.add(new Primitive(8));
		fourth.add(new Primitive(9));
		fifth.add(new Primitive(10));

		first.traverse();
	}
}
