package interpreter.case6;

import interpreter.case6.AbstractExpression.Expression;
import interpreter.case6.NonTerminalExpression.Add;
import interpreter.case6.NonTerminalExpression.Product;
import interpreter.case6.NonTerminalExpression.Substract;

public class ExpressionUtils {

	public static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*"))
			return true;
		else
			return false;
	}

	public static Expression getOperator(String s, Expression left, Expression right) {
		switch (s) {
			case "+":
				return new Add(left, right);
			case "-":
				return new Substract(left, right);
			case "*":
				return new Product(left, right);
		}
		return null;
	}
}
