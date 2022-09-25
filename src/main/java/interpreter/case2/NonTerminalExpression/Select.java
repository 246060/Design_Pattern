package interpreter.case2.NonTerminalExpression;

import interpreter.case2.AbstractExpression.Expression;
import interpreter.case2.Context.Context;

import java.util.List;

public class Select implements Expression {

	private String column;
	private From from;

	public Select(String column, From from) {
		this.column = column;
		this.from = from;
	}

	@Override
	public List<String> interpret(Context context) {
		context.setColumn(column);
		return from.interpret(context);
	}
}
