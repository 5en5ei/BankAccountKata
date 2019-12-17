package domaine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Operation {
    private final Date date = new Date();
    private final Amount amountOperation;
    private final Amount balanceAmount;
    private final DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy");
    private final OperationsEnum operation;

    public Operation(Amount amountOperation, Amount balanceAmount, OperationsEnum operation) {
        this.amountOperation = Objects.requireNonNull(amountOperation);
        this.balanceAmount = Objects.requireNonNull(balanceAmount);
        this.operation = operation;
    }



    @Override
    public String toString() {
        return "Date: "+simpleDateFormat.format(date) + " " + operation + " " + "Transaction: "+ amountOperation + " " + "Total in this account: " + balanceAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operation)) return false;
        Operation operation1 = (Operation) o;
        return Objects.equals(date, operation1.date) &&
                amountOperation.equals(operation1.amountOperation) &&
                balanceAmount.equals(operation1.balanceAmount) &&
                Objects.equals(simpleDateFormat, operation1.simpleDateFormat) &&
                operation == operation1.operation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amountOperation, balanceAmount, simpleDateFormat, operation);
    }
}
