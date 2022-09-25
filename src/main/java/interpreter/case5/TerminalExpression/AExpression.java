package interpreter.case5.TerminalExpression;

import interpreter.case5.AbstractExpression.Expression;
import interpreter.case5.Context.Context;

public class AExpression extends Expression {

	public void interpret(Context context) {
		System.out.println("a expression");
		String input = context.getInput();

		context.setInput(input.substring(1));
		context.setOutput(context.getOutput() + "1");
	}

}