package chain_of_responsibility.case2;

public class Dollar20Dispenser implements DispenseChain {

    private DispenseChain next;

    @Override
    public void next(DispenseChain dispenseChain) {
        this.next = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {

        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;

            System.out.println("Dispensing " + num + " 20$ note");

            if (remainder != 0) {
                this.next.dispense(new Currency(remainder));
            }

        } else {
            this.next.dispense(currency);
        }
    }
}
