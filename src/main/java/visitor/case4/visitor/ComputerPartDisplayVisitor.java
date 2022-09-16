package visitor.case4.visitor;

import visitor.case4.visitable.Computer;
import visitor.case4.visitable.Keyboard;
import visitor.case4.visitable.Moniter;
import visitor.case4.visitable.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Moniter moniter) {
        System.out.println("Displaying Monitor.");
    }
}
