package abstract_factory.case4;

public class EmberFactory extends AbstractFactory {

    @Override
    public CPU createCPU() {
        System.out.println("Ember CPU 생성");
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        System.out.println("Ember MMU 생성");
        return new EmberMMU();
    }
}
