package chain_of_responsibility.case2;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain next;

    @Override
    public void next(DispenseChain dispenseChain) {
        this.next = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {

        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;

            System.out.println("Dispensing " + num + " 10$ note");

            if (remainder != 0) {
                this.next.dispense(new Currency(remainder));
            }

        } else {
            this.next.dispense(currency);
        }
    }
}
