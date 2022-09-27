package visitor.case6;

import visitor.case6.ConcreteElement.DLinkRouter;
import visitor.case6.ConcreteElement.LinkSysRouter;
import visitor.case6.ConcreteElement.TPLinkRouter;
import visitor.case6.ConcreteVisitor.LinuxConfigurator;
import visitor.case6.ConcreteVisitor.MacConfigurator;
import visitor.case6.visitor.RouterVisitor;

public class Client {

	public static void main(String[] args) {

		DLinkRouter dlink = new DLinkRouter();
		TPLinkRouter tplink = new TPLinkRouter();
		LinkSysRouter linksys = new LinkSysRouter();


		RouterVisitor macConfigurator = new MacConfigurator();

		dlink.accept(macConfigurator);
		tplink.accept(macConfigurator);
		linksys.accept(macConfigurator);


		RouterVisitor linuxConfigurator = new LinuxConfigurator();

		dlink.accept(linuxConfigurator);
		tplink.accept(linuxConfigurator);
		linksys.accept(linuxConfigurator);
	}
}
