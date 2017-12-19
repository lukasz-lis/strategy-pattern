package pl.eightbits;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.eightbits.AccountType.*;

class SalaryManagerTest {

    @Test
    void mapSalariesAsExpected() {
        List<AccountType> accountTypes = Arrays.asList(MANAGER, REGULAR, SENIOR);

        SalaryManager salaryManager = new SalaryManager();
        List<Account> accounts = salaryManager.paySalariesFor(accountTypes);

        List<Account> expectedResult = new ArrayList<>();
        expectedResult.add(new Account(new BigDecimal("2000"), MANAGER));
        expectedResult.add(new Account(new BigDecimal("500"), REGULAR));
        expectedResult.add(new Account(new BigDecimal("1000"), SENIOR));

        assertEquals(expectedResult, accounts);
    }

}