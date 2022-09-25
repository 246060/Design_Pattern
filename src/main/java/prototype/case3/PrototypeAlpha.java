package prototype.case3;

// 5. Sign-up for the clone() contract.
// Each class calls "new" on itself FOR the client.
public class PrototypeAlpha implements Prototype {

    private String name = "AlphaVersion";

    @Override
    public Prototype clone() {
        return new PrototypeAlpha();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.out.println(name + ": does something");
    }
}
