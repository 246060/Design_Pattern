package template_method.case3;

public class Client {

    // https://sourcemaking.com/design_patterns/template_method/java/2
    public static void main(String[] args) {
        Generalization algorithm = new Realization();
        algorithm.findSolution();
    }
}
