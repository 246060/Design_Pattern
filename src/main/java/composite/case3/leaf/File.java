package composite.case3.leaf;

import composite.case3.component.Base;
import composite.case3.Client;

public class File implements Base {

	private String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public void ls() {
		System.out.println(Client.compositeBuilder + name);
	}
}
