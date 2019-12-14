package domaine;

import java.util.Date;
import java.util.Objects;

public class Operation {
    private final Date date;
    private final Amount amount;
    private final Balance balance;

    public Operation(Date date, Amount amount, Balance balance) {
        this.date = Objects.requireNonNull(date);
        this.amount = Objects.requireNonNull(amount);
        this.balance = Objects.requireNonNull(balance);
    }
}
