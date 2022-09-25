package interpreter.case2.NonTerminalExpression;

import interpreter.case2.AbstractExpression.Expression;
import interpreter.case2.Context.Context;
import interpreter.case2.TerminalExpression.Where;

import java.util.List;

public class From implements Expression {

	private String table;
	private Where where;

	public From(String table) {
		this.table = table;
	}

	public From(String table, Where where) {
		this.table = table;
		this.where = where;
	}

	@Override
	public List<String> interpret(Context context) {
		context.setTable(table);
		if (where == null) {
			return context.search();
		}
		return where.interpret(context);
	}
}
