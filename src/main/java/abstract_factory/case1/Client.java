package abstract_factory.case1;

public class Client {
    public static void main(String[] args) {

        AbstractFactory factory = null;

        factory = AbstractFactory.getFactory(Architecture.EMBER);
        CPU emberCPU = factory.createCPU();
        MMU emberMMU = factory.createMMU();

        factory = AbstractFactory.getFactory(Architecture.ENGINOLA);
        CPU enginolaCPU = factory.createCPU();
        MMU enginolaMMU = factory.createMMU();


    }
}
