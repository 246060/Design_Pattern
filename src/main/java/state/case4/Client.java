package state.case4;

import state.case4.ConcreteState.TVStartState;
import state.case4.ConcreteState.TVStopState;
import state.case4.Context.TVContext;

public class Client {

	public static void main(String[] args) {

		TVContext context = new TVContext();

		context.setState(new TVStartState());
		context.doAction();

		context.setState(new TVStopState());
		context.doAction();

	}

}
