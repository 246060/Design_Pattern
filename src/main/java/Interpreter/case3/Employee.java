package Interpreter.case3;

abstract public class Employee {
    protected long employeeId;
    protected String employeeName;
    protected String designation;
    protected Department department;
    protected int salary;

    public Employee(long employeeId, String employeeName, String designation, Department department, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public Department getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    abstract public int teamSize();
    abstract public String teamNames();
    abstract public boolean isManager();

    public String fullDetails() {
        StringBuilder builder = new StringBuilder();
        builder.append("Employee [")
               .append(employeeId)
               .append(", ")
               .append(employeeName)
               .append(", ")
               .append(designation)
               .append(", ")
               .append(department)
               .append(", ")
               .append(salary)
               .append(", ")
               .append(", teamSize=")
               .append(teamSize())
               .append(", Team=")
               .append(teamNames())
               .append("]");

        return builder.toString();
    }

    public String shortDetails() {
        StringBuilder builder = new StringBuilder();
        builder.append("'")
               .append(employeeName)
               .append("'");
        return builder.toString();
    }

    @Override
    public String toString() {
        return fullDetails();
    }
}
