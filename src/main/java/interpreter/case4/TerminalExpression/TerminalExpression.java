package interpreter.case4.TerminalExpression;

import interpreter.case4.AbstractExpression.Expression;

public class TerminalExpression implements Expression {

	String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	public boolean interpreter(String con) {
		if (con.contains(data)) {
			return true;
		} else {
			return false;
		}
	}
}
