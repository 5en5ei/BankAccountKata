package domaine;

import org.junit.jupiter.api.Test;

class unitTest {

    @Test
    void printTest(){
        Account account = new Account(new Amount(10));
        account.withdraw(new Amount(5));
        account.deposit(new Amount(15));
        account.printOperations();
    }
}
