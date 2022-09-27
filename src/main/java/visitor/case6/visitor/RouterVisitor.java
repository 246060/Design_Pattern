package visitor.case6.visitor;

import visitor.case6.ConcreteElement.DLinkRouter;
import visitor.case6.ConcreteElement.LinkSysRouter;
import visitor.case6.ConcreteElement.TPLinkRouter;

public interface RouterVisitor {
	void visit(DLinkRouter router);
	void visit(TPLinkRouter router);
	void visit(LinkSysRouter router);
}
