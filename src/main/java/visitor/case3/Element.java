package visitor.case3;

abstract public class Element {

    public String uuid;

    public Element(String uuid) {
        this.uuid = uuid;
    }

    abstract public void accept(Visitor v);

}
