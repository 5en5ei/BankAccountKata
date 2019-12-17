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

    @Override
    public String toString() {
        return mediumDateFormat.format(date) + " " + amountOperation + " " + balanceAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operation)) return false;
        Operation operation = (Operation) o;
        return date.equals(operation.date) &&
                amountOperation.equals(operation.amountOperation) &&
                balanceAmount.equals(operation.balanceAmount) &&
                Objects.equals(mediumDateFormat, operation.mediumDateFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amountOperation, balanceAmount, mediumDateFormat);
    }
}
