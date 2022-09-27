package state.case4.AbstractState;

import state.case4.Context.Context;

public interface State {
	void doAction(Context context);
}
