package domaine;

import java.text.DateFormat;
import java.util.Date;
import java.util.Objects;

public class Operation {
    private final Date date;
    private final Amount amountOperation;
    private final Amount balanceAmount;

    private final DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
            DateFormat.MEDIUM,
            DateFormat.MEDIUM);

    public Operation(Date date, Amount amountOperation, Amount balanceAmount) {
        this.date = Objects.requireNonNull(date);
        this.amountOperation = Objects.requireNonNull(amountOperation);
        this.balanceAmount = Objects.requireNonNull(balanceAmount);
    }

    public void print(){
        System.out.println(mediumDateFormat.format(date) + " " + amountOperation.getAmount() + " " + balanceAmount.getAmount());
    }
}
