package interpreter.case2.AbstractExpression;

import interpreter.case2.Context.Context;

import java.util.List;

public interface Expression {

    List<String> interpret(Context context);
}
