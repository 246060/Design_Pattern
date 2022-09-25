package interpreter.case6.TerminalExpression;

import interpreter.case6.AbstractExpression.Expression;

public class Number implements Expression {

	private final int n;

	public Number(int n) {
		this.n = n;
	}

	@Override
	public int interpret() {
		return n;
	}

}

