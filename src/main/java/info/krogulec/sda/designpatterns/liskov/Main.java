package info.krogulec.sda.designpatterns.liskov;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Employee employee = new Employee();
        Employee employeeCustom = new Manager();
        Employee employeeVolounteer = new Volounteer();

        new Company(List.of(manager, employee, employeeCustom, employeeVolounteer)).payroll();
    }
}
