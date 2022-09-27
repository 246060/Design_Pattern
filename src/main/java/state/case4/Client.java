package state.case4;

import state.case4.ConcreteState.StartState;
import state.case4.ConcreteState.StopState;
import state.case4.Context.Context;

public class Client {

	public static void main(String[] args) {

		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());


		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());

	}
}
