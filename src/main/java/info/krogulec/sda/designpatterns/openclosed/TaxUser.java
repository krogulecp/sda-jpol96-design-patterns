package info.krogulec.sda.designpatterns.openclosed;

import lombok.val;

public class TaxUser {

    public static void main(String[] args) {
        final val salary = new SalaryCalculator(new GermanTaxPolicy()).calculateSalary(new Employee());
        System.out.println(salary);
    }
}
