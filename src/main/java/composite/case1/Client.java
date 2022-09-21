package composite.case1;

import composite.case1.composite.CompositeGraphic;
import composite.case1.leaf.Ellipse;

public class Client {

	// https://ko.wikipedia.org/wiki/%EC%BB%B4%ED%8F%AC%EC%A7%80%ED%8A%B8_%ED%8C%A8%ED%84%B4
	public static void main(String[] args) {

		CompositeGraphic root = new CompositeGraphic();

		CompositeGraphic graphic1 = new CompositeGraphic();
		graphic1.add(new Ellipse());
		graphic1.add(new Ellipse());
		graphic1.add(new Ellipse());

		CompositeGraphic graphic2 = new CompositeGraphic();
		graphic2.add(new Ellipse());

		root.add(graphic1);
		root.add(graphic2);

		root.print();
	}
}
