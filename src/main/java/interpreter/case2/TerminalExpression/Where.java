package interpreter.case2.TerminalExpression;

import interpreter.case2.AbstractExpression.Expression;
import interpreter.case2.Context.Context;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {

	private Predicate<String> filter;

	public Where(Predicate<String> filter) {
		this.filter = filter;
	}

	@Override
	public List<String> interpret(Context context) {
		context.setFilter(filter);
		return context.search();
	}
}
