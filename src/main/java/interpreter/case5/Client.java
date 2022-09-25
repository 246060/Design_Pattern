package interpreter.case5;

import interpreter.case5.AbstractExpression.Expression;
import interpreter.case5.Context.Context;
import interpreter.case5.TerminalExpression.AExpression;
import interpreter.case5.TerminalExpression.BExpression;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		String str = "ab";
		Context context = new Context(str);


		List<Expression> list = new ArrayList<>();
		list.add(new AExpression());
		list.add(new BExpression());


		for (Expression ex : list) {
			ex.interpret(context);
		}


		System.out.println(context.getOutput());
	}
}
