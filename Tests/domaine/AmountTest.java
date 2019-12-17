package domaine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmountTest {

    @Test
    void isNegative() {
        Amount amount = new Amount(-10);
        assertTrue(amount.isNegative());
    }

    @Test
    void addMoney() {
        Amount amount = new Amount(10);
        assertEquals(amount.addMoney(new Amount(10)).getAmount(), 20);
    }

    @Test
    void retrieveMoney() {
        Amount amount = new Amount(10);
        assertEquals(amount.retrieveMoney(new Amount(10)).getAmount(), 0);
    }
}