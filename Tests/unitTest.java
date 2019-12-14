import domaine.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class unitTest {

    private static final int EMPTY_ACCOUNT = 0;

    @Test
    void createANewAccount() {
        Account account = new Account(0);
        assertEquals(account.getBalance().getBalance(), EMPTY_ACCOUNT);
    }

    @Test
    void createANewAccountWithCashInIt() {
        Account account = new Account(10);
        assertEquals(account.getBalance().getBalance(), 10);
    }

    @Test
    void addAmountToAnEmptyAccount(){
        Account account = new Account(0);
        account.deposit(10);
        assertEquals(account.getBalance().getBalance(), 10);
    }

    @Test
    void addAmountToAnAccount(){
        Account account = new Account(10);
        account.deposit(10);
        assertEquals(account.getBalance().getBalance(), 20);
    }

    @Test
    void addANegativeAmountToAnAccount(){
        Account account = new Account(0);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10));
    }

    @Test
    void withdrawAllTheSavings(){
        Account account = new Account(10);
        account.withdraw(10);
        assertEquals(account.getBalance().getBalance(), 0);
    }

    @Test
    void withdrawAPartOfTheSavings(){
        Account account = new Account(10);
        account.withdraw(5);
        assertEquals(account.getBalance().getBalance(), 5);
    }

    @Test
    void withdrawANegativeAmount(){
        Account account = new Account(10);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10));
    }

    @Test
    void withdrawMoreThanTereIsOnTheAccount(){
        Account account = new Account(10);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
    }
}
