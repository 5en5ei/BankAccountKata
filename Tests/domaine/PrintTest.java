package domaine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {

    @Test
    void printTest(){
        Account account = new Account(new Amount(10));
        account.withdraw(new Amount(5));
        account.deposit(new Amount(15));
        account.printOperations();
        assertEquals(account.printOperations(),
                "17 déc. 2019 à 12:49:02 10 10\n" +
                "17 déc. 2019 à 12:49:02 5 5\n" +
                "17 déc. 2019 à 12:49:02 15 20");
    }
}