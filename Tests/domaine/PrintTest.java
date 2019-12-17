package domaine;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


class PrintTest {
    private Date date = new Date();
    private DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy");

    @Test
    void printTest(){
        Account account = new Account(new Amount(100));
        account.withdraw(new Amount(5));
        account.deposit(new Amount(15));
        assertEquals(account.printOperations(),
                "Date: "+ simpleDateFormat.format(date) +" New account"+" Transaction: 100 Total in this account: 100\n" +
                "Date: "+ simpleDateFormat.format(date) +" Withdraw"+" Transaction: 5 Total in this account: 95\n" +
                "Date: "+ simpleDateFormat.format(date) +" Deposit"+" Transaction: 15 Total in this account: 110");
        System.out.println(account.printOperations());
    }
}