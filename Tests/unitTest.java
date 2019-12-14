import domaine.Account;
import domaine.Amount;
import domaine.Balance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class unitTest {


    @Test
    void createANewAccount() {
        Account account = new Account(new Amount(0));
        assertEquals(account.getBalance(), new Balance(new Amount(0)));
    }

    @Test
    void createANullAccount() {
        assertThrows(NullPointerException.class, () -> new Account(null));
    }

    @Test
    void createANewAccountWithCashInIt() {
        Account account = new Account(new Amount(10));
        assertEquals(account.getBalance(), new Balance(new Amount(10)));
    }

    @Test
    void addAmountToAnEmptyAccount(){
        Account account = new Account(new Amount(0));
        account.deposit(new Amount(10));
        assertEquals(account.getBalance(), new Balance(new Amount(10)));
    }

    @Test
    void addAmountToAnAccount(){
        Account account = new Account(new Amount(10));
        account.deposit(new Amount(10));
        assertEquals(account.getBalance(), new Balance(new Amount(20)));
    }

    @Test
    void addANegativeAmountToAnAccount(){
        Account account = new Account(new Amount(0));
        assertThrows(IllegalArgumentException.class, () -> account.deposit(new Amount(-10)));
    }

    @Test
    void withdrawAllTheSavings(){
        Account account = new Account(new Amount(10));
        account.withdraw(new Amount(10));
        assertEquals(account.getBalance(), new Balance(new Amount(0)));
    }

    @Test
    void withdrawAPartOfTheSavings(){
        Account account = new Account(new Amount(10));
        account.withdraw(new Amount(5));
        assertEquals(account.getBalance(), new Balance(new Amount(5)));
    }

    @Test
    void withdrawANegativeAmount(){
        Account account = new Account(new Amount(10));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(new Amount(-10)));
    }

    @Test
    void withdrawMoreThanTereIsOnTheAccount(){
        Account account = new Account(new Amount(10));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(new Amount(-100)));
    }
}
