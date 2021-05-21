package abstract_factory.case3;

public class PCFactory extends AbstractFactory {

    public PCFactory() {
        prototype = new PCPhase();
    }

    @Override
    public Expression makeGrade() {
        return new Expression("\"you pass, self-esteem intact\"");
    }

    @Override
    public Expression makeCompromise() {
        return new Expression("\"do it your way, any way, or no way\"");
    }
}
