package interpreter.case6.NonTerminalExpression;

import interpreter.case6.AbstractExpression.Expression;

public class Product implements Expression {

	private final Expression leftExpression;
	private final Expression rightExpression;

	public Product(Expression leftExpression,Expression rightExpression ){
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	@Override
	public int interpret() {
		return leftExpression.interpret() * rightExpression.interpret();
	}
}

