package visitor.case6.Element;

import visitor.case6.visitor.RouterVisitor;

public interface Router {
	void sendData(char[] data);
	void acceptData(char[] data);
	void accept(RouterVisitor v);
}
