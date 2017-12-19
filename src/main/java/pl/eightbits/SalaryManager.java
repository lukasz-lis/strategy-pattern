package pl.eightbits;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import static pl.eightbits.AccountType.MANAGER;
import static pl.eightbits.AccountType.REGULAR;
import static pl.eightbits.AccountType.SENIOR;

class SalaryManager {

    List<Account> paySalariesFor(List<AccountType> accountTypes) {

        return accountTypes.stream().map(accountType -> {
            if (MANAGER.equals(accountType)) {
                return new Account(new BigDecimal("2000"), accountType);
            }
            if (SENIOR.equals(accountType)) {
                return new Account(new BigDecimal("1000"), accountType);
            }
            if (REGULAR.equals(accountType)) {
                return new Account(new BigDecimal("500"), accountType);
            }
            return new Account(new BigDecimal("20000"), accountType);
        }).collect(Collectors.toList());
    }
}
