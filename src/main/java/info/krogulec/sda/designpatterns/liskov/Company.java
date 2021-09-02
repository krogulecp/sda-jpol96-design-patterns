package info.krogulec.sda.designpatterns.liskov;

import java.util.List;

public class Company {
    private final List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void payroll(){
        employees.forEach(Employee::takeSalary);
    }
}
