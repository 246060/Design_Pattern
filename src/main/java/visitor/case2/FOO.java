package visitor.case2;

public class FOO implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getFOO() {
        return "FOO";
    }
}
