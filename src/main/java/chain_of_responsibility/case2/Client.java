package chain_of_responsibility.case2;

import chain_of_responsibility.case2.ConcreteHandler.Dollar10Dispenser;
import chain_of_responsibility.case2.ConcreteHandler.Dollar20Dispenser;
import chain_of_responsibility.case2.ConcreteHandler.Dollar50Dispenser;
import chain_of_responsibility.case2.Handler.DispenseChain;

import java.util.Scanner;

public class Client {

    // https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java

    private DispenseChain rootHandler;

    public Client() {
        this.rootHandler = new Dollar50Dispenser();
        DispenseChain nextHandler1 = new Dollar20Dispenser();
        DispenseChain nextHandler2 = new Dollar10Dispenser();

        rootHandler.next(nextHandler1);
        nextHandler1.next(nextHandler2);
    }

    public static void main(String[] args) {
        Client client = new Client();

        while (true) {
            int amount = 0;

            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }

            // process the request
            client.rootHandler.dispense(new Currency(amount));
        }
    }
}
