package visitor.case4.visitor;

import visitor.case4.visitable.Computer;
import visitor.case4.visitable.Keyboard;
import visitor.case4.visitable.Moniter;
import visitor.case4.visitable.Mouse;

public interface ComputerPartVisitor {

    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Moniter moniter);
}
