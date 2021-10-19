package Interpreter.case3;

import java.util.stream.Collectors;

public class ManagerOfExpression extends TerminalExpression {

    protected String name;

    public ManagerOfExpression(String name) {
        this.name = name;
    }


    @Override
    public boolean interpret(Employee context) {

        if (context.isManager()) {
            Manager manager = (Manager) context;

            return manager.getManagingEmployees()
                          .stream()
                          .map(managinEmployee -> managinEmployee.getEmployeeName()
                                                                 .toLowerCase())
                          .collect(Collectors.toList())
                          .contains(name.toLowerCase());
        }

        return false;
    }
}
