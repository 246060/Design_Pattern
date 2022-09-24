package chain_of_responsibility.case2.Handler;

import chain_of_responsibility.case2.Currency;

public interface DispenseChain {
	void next(DispenseChain dispenseChain);
	void dispense(Currency currency);
}
