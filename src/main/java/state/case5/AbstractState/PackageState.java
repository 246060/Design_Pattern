package state.case5.AbstractState;

import state.case5.Context.DeliveryContext;

public interface PackageState {
	void updateState(DeliveryContext ctx);
}
