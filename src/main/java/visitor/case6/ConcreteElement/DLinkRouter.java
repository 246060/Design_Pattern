package visitor.case6.ConcreteElement;

import visitor.case6.Element.Router;
import visitor.case6.visitor.RouterVisitor;

public class DLinkRouter implements Router {

	@Override
	public void sendData(char[] data) {
	}

	@Override
	public void acceptData(char[] data) {
	}

	@Override
	public void accept(RouterVisitor v) {
		v.visit(this);
	}
}
