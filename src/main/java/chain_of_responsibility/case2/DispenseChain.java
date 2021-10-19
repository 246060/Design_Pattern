package chain_of_responsibility.case2;

public interface DispenseChain {
    void next(DispenseChain dispenseChain);
    void dispense(Currency currency);
}
