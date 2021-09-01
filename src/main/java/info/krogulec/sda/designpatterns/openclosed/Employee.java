package info.krogulec.sda.designpatterns.openclosed;

import java.math.BigDecimal;

public class Employee {
    public BigDecimal getWorkingDays() {
        return new BigDecimal(30);
    }

    public BigDecimal getDailyRate() {
        return new BigDecimal(100);
    }
}
