package domaine;

import java.util.Objects;

public class Amount {
    private final int value;

    public Amount(int value) {
        this.value = value;
    }

    public Amount getValue(){
        return this;
    }

    boolean isNegative() {
        return value < 0;
    }

    Amount addMoney(Amount amountAdded){
        return new Amount(value + amountAdded.value);
    }

    boolean containsLessMoney(Amount comparedAmount){
        return this.value < comparedAmount.value;
    }

    Amount  retrieveMoney(Amount amountAdded){
        return new Amount(value - amountAdded.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amount)) return false;
        Amount amount = (Amount) o;
        return value == amount.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
