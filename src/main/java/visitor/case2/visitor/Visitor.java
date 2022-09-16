package visitor.case2.visitor;

import visitor.case2.visitable.BAR;
import visitor.case2.visitable.BAZ;
import visitor.case2.visitable.FOO;

public interface Visitor {
    void visit(FOO foo);
    void visit(BAR bar);
    void visit(BAZ baz);
}
