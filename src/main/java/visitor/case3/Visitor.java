package visitor.case3;

public interface Visitor {
    void visit(XmlElement xe);
    void visit(JsonElement js);
}
