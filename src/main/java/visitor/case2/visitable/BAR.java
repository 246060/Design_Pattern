package visitor.case2.visitable;

import visitor.case2.visitor.Visitor;

public class BAR implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getBAR() {
        return "BAR";
    }
}

