package composite.case1.leaf;

import composite.case1.component.Graphic;

public class Ellipse implements Graphic {

	private static int index = 0;
	private String name;

	public Ellipse() {
		this.name = "Ellipse-" + ++index;
	}

	@Override
	public void print() {
		System.out.println(name);
	}
}
