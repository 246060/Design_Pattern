package chain_of_responsibility.case1;

public class Client {

    // https://sourcemaking.com/design_patterns/chain_of_responsibility/java/1

    public static void main(String[] args) {

        Handler rootChain = new Handler();

        rootChain.add(new Handler());
        rootChain.add(new Handler());
        rootChain.add(new Handler());

        rootChain.wrapAround(rootChain);

        for (int i = 1; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            rootChain.execute(i);
            System.out.println();
        }
    }
}
