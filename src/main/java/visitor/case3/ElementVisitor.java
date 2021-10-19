package visitor.case3;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XmlElement xe) {
        System.out.println("processing xml element with uuid: " + xe.uuid);
    }

    @Override
    public void visit(JsonElement js) {
        System.out.println("processing json element with uuid: " + js.uuid);
    }
}
