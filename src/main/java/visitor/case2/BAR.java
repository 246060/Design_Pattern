package visitor.case2;

public class BAR implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getBAR() {
        return "BAR";
    }
}
