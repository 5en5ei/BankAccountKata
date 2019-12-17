package domaine;

import java.util.Objects;

public class Balance {
    private Amount amount;

    public Balance(Amount amount) {
        this.amount = amount;
    }

    Amount getBalance() {
        return amount;
    }

    int showAmount() { return amount.getAmount();}

    Balance addAmount(Amount amountAdded){
       return new Balance(amount.addMoney(amountAdded));
    }

    Balance retrieveAmount(Amount amountAdded){
       return new Balance(amount.retrieveMoney(amountAdded));
    }

    boolean NotEnoughMoney(Amount amountRetrieved) {
        return amount.getAmount() < amountRetrieved.getAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Balance)) return false;
        Balance balance = (Balance) o;
        return amount.equals(balance.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}