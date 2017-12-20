package pl.eightbits;

import java.math.BigDecimal;

public class SeniorSalaryAlgorithm implements SalaryAlgorithm {

    private static final String RATE = "1";

    @Override
    public BigDecimal calculateSalary(final BigDecimal baseSalary) {
        return new BigDecimal(RATE).multiply(baseSalary);
    }
}
