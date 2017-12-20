package pl.eightbits;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import static pl.eightbits.AccountType.MANAGER;
import static pl.eightbits.AccountType.REGULAR;
import static pl.eightbits.AccountType.SENIOR;

class SalaryManager {

    List<Account> paySalariesFor(List<AccountType> accountTypes, BigDecimal baseSalary) {

        return accountTypes.stream().map(accountType -> {
            if (MANAGER.equals(accountType)) {
                return new Account(new BigDecimal("2").multiply(baseSalary), accountType);
            }
            if (SENIOR.equals(accountType)) {
                return new Account(new BigDecimal("1").multiply(baseSalary), accountType);
            }
            if (REGULAR.equals(accountType)) {
                return new Account(new BigDecimal("0.5").multiply(baseSalary), accountType);
            }
            return new Account(baseSalary, accountType);
        }).collect(Collectors.toList());
    }
}
