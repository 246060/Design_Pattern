package null_object.case2;

import null_object.case2.NullClass.NullNode;
import null_object.case2.RealClass.NodeImpl;

public class Client {

	public static void main(String[] args) {

		var root = new NodeImpl(
						"1",
						new NodeImpl("11", new NodeImpl("111", NullNode.getInstance(), NullNode.getInstance()), NullNode.getInstance()),
						new NodeImpl("12", NullNode.getInstance(), new NodeImpl("122", NullNode.getInstance(), NullNode.getInstance()))
		);

		root.walk();
	}

}
