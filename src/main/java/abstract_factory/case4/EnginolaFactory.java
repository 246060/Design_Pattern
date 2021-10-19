package abstract_factory.case4;

public class EnginolaFactory extends AbstractFactory {

    @Override
    public CPU createCPU() {
        System.out.println("Enginola CPU 생성");
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        System.out.println("Enginola MMU 생성");
        return new EmberMMU();
    }
}
