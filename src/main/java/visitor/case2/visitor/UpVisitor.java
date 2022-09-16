package visitor.case2.visitor;

import visitor.case2.visitable.BAR;
import visitor.case2.visitable.BAZ;
import visitor.case2.visitable.FOO;

public class UpVisitor implements Visitor {

    @Override
    public void visit(FOO foo) {
        System.out.println("do Up on " + foo.getFOO());
    }

    @Override
    public void visit(BAR bar) {
        System.out.println("do Up on " + bar.getBAR());
    }

    @Override
    public void visit(BAZ baz) {
        System.out.println("do Up on " + baz.getBAZ());
    }
}
