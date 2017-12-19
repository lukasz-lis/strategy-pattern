package pl.eightbits;

import java.math.BigDecimal;
import java.util.Objects;

class Account {

    private final BigDecimal salary;
    private final AccountType accountType;

    Account(BigDecimal salary, AccountType accountType) {
        this.salary = salary;
        this.accountType = accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(salary, account.salary) &&
                accountType == account.accountType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, accountType);
    }

    @Override
    public String toString() {
        return "Account{" +
                "salary=" + salary +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
