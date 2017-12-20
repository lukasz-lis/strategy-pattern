package pl.eightbits;

import java.math.BigDecimal;

public class RegularSalaryAlgorithm implements SalaryAlgorithm {

    private static final String RATE = "0.5";

    @Override
    public BigDecimal calculateSalary(final BigDecimal baseSalary) {
        return new BigDecimal(RATE).multiply(baseSalary);
    }
}
