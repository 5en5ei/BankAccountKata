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
}
