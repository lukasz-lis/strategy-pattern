package pl.eightbits;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static pl.eightbits.AccountType.MANAGER;
import static pl.eightbits.AccountType.REGULAR;
import static pl.eightbits.AccountType.SENIOR;

class SalaryManager {

    List<Account> paySalariesFor(final List<AccountType> accountTypes, final BigDecimal baseSalary) {

        final Map<AccountType, SalaryAlgorithm> algorithms = new HashMap<>();
        algorithms.put(MANAGER, new ManagerSalaryAlgorithm());
        algorithms.put(SENIOR, new SeniorSalaryAlgorithm());
        algorithms.put(REGULAR, new RegularSalaryAlgorithm());

        return accountTypes.stream()
                .map(createAccount(baseSalary, algorithms))
                .collect(Collectors.toList());
    }

    private Function<AccountType, Account> createAccount(final BigDecimal baseSalary, final Map<AccountType, SalaryAlgorithm> algorithms) {
        return accountType -> {
            final SalaryAlgorithm salaryAlgorithm = algorithms.get(accountType);
            return new Account(salaryAlgorithm.calculateSalary(baseSalary), accountType);
        };
    }
}
