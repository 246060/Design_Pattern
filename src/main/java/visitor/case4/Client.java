package visitor.case4;

public class Client {

    // https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
