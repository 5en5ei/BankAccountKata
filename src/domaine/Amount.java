package domaine;

import java.util.Objects;

public class Amount {
    private final int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    int getAmount(){
        return amount;
    }

    boolean isNegative() {
        return amount < 0;
    }

    Amount addMoney(Amount amountAdded){
        return new Amount(amount + amountAdded.getAmount());
    }

    Amount  retrieveMoney(Amount amountAdded){
        return new Amount(amount - amountAdded.getAmount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amount)) return false;
        Amount amount1 = (Amount) o;
        return getAmount() == amount1.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount());
    }
}
