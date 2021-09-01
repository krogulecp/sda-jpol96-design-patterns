package info.krogulec.sda.designpatterns.openclosed;

import java.math.BigDecimal;

public interface TaxPolicy {
    BigDecimal calculateTax(BigDecimal initialAmount);
}
