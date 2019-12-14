import domaine.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class unitTest {

    public static final int EMPTY_ACCOUNT = 0;

    @Test
    void createANewAccount() {
        Account account = new Account(0);
        assertEquals(account.getBalance(), EMPTY_ACCOUNT);
    }

    @Test
    void createANewAccountWithCashInIt() {
        Account account = new Account(10);
        assertEquals(account.getBalance(), 10);
    }

    @Test
    void addAmountToAnEmptyAccount(){
        Account account = new Account(0);
        account.deposite(10);
        assertEquals(account.getBalance(), 10);
    }

    @Test
    void addAmountToAnAccount(){
        Account account = new Account(10);
        account.deposite(10);
        assertEquals(account.getBalance(), 20);
    }

}
