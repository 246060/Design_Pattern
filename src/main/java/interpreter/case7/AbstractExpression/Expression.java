package interpreter.case7.AbstractExpression;


import interpreter.case7.Context.Employee;

public interface Expression {

	boolean interpret(Employee context);
}
