package pl.eightbits;

import java.math.BigDecimal;

public class ManagerSalaryAlgorithm implements SalaryAlgorithm {

    private static final String RATE = "2";

    @Override
    public BigDecimal calculateSalary(final BigDecimal baseSalary) {
        return new BigDecimal(RATE).multiply(baseSalary);
    }
}
