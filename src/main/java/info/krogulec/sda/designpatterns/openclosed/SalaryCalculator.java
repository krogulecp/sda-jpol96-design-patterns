package info.krogulec.sda.designpatterns.openclosed;

import lombok.val;

import java.math.BigDecimal;

public class SalaryCalculator {

    private final TaxPolicy taxPolicy;

    public SalaryCalculator(TaxPolicy taxPolicy) {
        this.taxPolicy = taxPolicy;
    }

    public BigDecimal calculateSalary(Employee employee){
        BigDecimal salaryWithoutTax = employee.getWorkingDays().multiply(employee.getDailyRate());
        final val tax = taxPolicy.calculateTax(salaryWithoutTax);
        return salaryWithoutTax.subtract(tax);
    }
}
