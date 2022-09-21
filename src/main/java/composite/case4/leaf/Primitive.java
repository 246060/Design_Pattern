package composite.case4.leaf;

import composite.case4.component.Component;

public class Primitive implements Component {

	private int value;

	public Primitive(int value) {
		this.value = value;
	}

	@Override
	public void traverse() {
		System.out.print(value + "  ");
	}
}
