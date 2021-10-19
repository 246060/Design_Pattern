package abstract_factory.case4;

public abstract class AbstractFactory {

    private static final EmberFactory EMBER_FACTORY = new EmberFactory();
    private static final EnginolaFactory ENGINOLA_FACTORY = new EnginolaFactory();

    public abstract CPU createCPU();
    public abstract MMU createMMU();

    // Returns a concrete factory object that is an instance of the concrete factory class appropriate for the given architecture.
    public static AbstractFactory getFactory(Architecture architecture) {
        AbstractFactory factory = null;

        switch (architecture) {
            case ENGINOLA: factory = ENGINOLA_FACTORY; break;
            case EMBER: factory = EMBER_FACTORY; break;
        }
        return factory;
    }

}
