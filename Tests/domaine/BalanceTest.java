package domaine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void addAmount() {
        Balance balance = new Balance(new Amount(50));
        assertEquals(balance.addAmount(new Amount(10)).showAmount(), 60);
    }

    @Test
    void retrieveAmount() {
        Balance balance = new Balance(new Amount(50));
        assertEquals(balance.retrieveAmount(new Amount(10)).showAmount(), 40);
    }

    @Test
    void notEnoughMoney() {
        Balance balance = new Balance(new Amount(0));
        assertTrue(balance.NotEnoughMoney(new Amount(10)));
    }
}