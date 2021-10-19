package Prototype.case1;

public class Client {

    /*
     * Abstract Factory might store a set of Prototypes
     * from which to clone and return product objects.
     * */
    public static void main(String[] args) {

        if (args.length > 0) {

            for (String type : args) {
                Person prototype = Factory.getPrototype(type);

                if (prototype != null)
                    System.out.println(prototype);
            }

        } else {
            System.out.println("Run again with arguments of command string ");
        }
    }
}
