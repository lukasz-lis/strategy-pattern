package pl.eightbits;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.eightbits.AccountType.*;

class SalaryManagerTest {

    @Test
    void mapSalariesAsExpected() {
        List<AccountType> accountTypes = Arrays.asList(MANAGER, REGULAR, SENIOR);

        SalaryManager salaryManager = new SalaryManager();
        List<Account> accounts = salaryManager.paySalariesFor(accountTypes, new BigDecimal("1000"));

        assertEquals(3, accounts.size());
        assertTrue(accounts.contains(new Account(new BigDecimal("2000"), MANAGER)));
        assertTrue(accounts.contains(new Account(new BigDecimal("500.0"), REGULAR)));
        assertTrue(accounts.contains(new Account(new BigDecimal("1000"), SENIOR)));
    }

}