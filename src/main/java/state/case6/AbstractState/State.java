package state.case6.AbstractState;

import state.case6.Context.Context;

public interface State {
	void doAction(Context context);
}
