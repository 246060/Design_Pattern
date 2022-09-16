package visitor.case2.visitable;

import visitor.case2.visitor.Visitor;

public class BAZ implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getBAZ() {
        return "BAZ";
    }
}
