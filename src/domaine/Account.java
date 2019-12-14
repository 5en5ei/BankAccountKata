package domaine;

import java.util.Objects;

public class Account {

    private Balance balance;

    public Account(Amount amount) {
        balance = new Balance(Objects.requireNonNull(amount));
    }

    public void deposit(Amount amount) {
        if(amount.isNegative()){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        balance = balance.addAmount(Objects.requireNonNull((amount)));
    }

    public void withdraw(Amount amount) {
        if(amount.isNegative()){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        if(balance.NotEnoughMoney(amount)){
            throw new IllegalArgumentException("Not enough money on your account");
        }
        balance = balance.retrieveAmount(Objects.requireNonNull(amount));
    }

    public Amount getBalance() {
        return balance.getBalance();
    }
}
