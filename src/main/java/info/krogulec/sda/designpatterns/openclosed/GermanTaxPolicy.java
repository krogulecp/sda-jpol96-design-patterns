package info.krogulec.sda.designpatterns.openclosed;

import java.math.BigDecimal;

public class GermanTaxPolicy implements TaxPolicy{

    private static final BigDecimal TAX_VALUE = new BigDecimal(0.21);

    @Override
    public BigDecimal calculateTax(BigDecimal initialAmount) {
        return initialAmount.multiply(TAX_VALUE);
    }
}
