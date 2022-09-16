package visitor.case2.visitable;

import visitor.case2.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
