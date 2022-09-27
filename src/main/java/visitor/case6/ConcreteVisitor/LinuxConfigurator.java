package visitor.case6.ConcreteVisitor;

import visitor.case6.ConcreteElement.DLinkRouter;
import visitor.case6.ConcreteElement.LinkSysRouter;
import visitor.case6.ConcreteElement.TPLinkRouter;
import visitor.case6.visitor.RouterVisitor;

public class LinuxConfigurator implements RouterVisitor {

	@Override
	public void visit(DLinkRouter router) {
		System.out.println("DLinkRouter Configuration for Linux complete !!");
	}

	@Override
	public void visit(TPLinkRouter router) {
		System.out.println("TPLinkRouter Configuration for Linux complete !!");
	}

	@Override
	public void visit(LinkSysRouter router) {
		System.out.println("LinkSysRouter Configuration for Linux complete !!");
	}
}
