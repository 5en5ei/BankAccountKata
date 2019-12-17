package domaine;

import java.util.Date;
import java.util.LinkedList;
import java.util.Objects;

public class Account {

    private Balance balance;

    private final LinkedList<Operation> operations = new LinkedList<>();

    public Account(Amount amount) {
        balance = new Balance(Objects.requireNonNull(amount));
        operations.add(new Operation(new Date(), amount, balance.getBalance()));
    }

    public void deposit(Amount amount) {
        if(amount.isNegative()){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        balance = balance.addAmount(Objects.requireNonNull((amount)));
        operations.add(new Operation(new Date(), amount, balance.getBalance()));
    }

    public void withdraw(Amount amount) {
        if(amount.isNegative()){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        if(balance.NotEnoughMoney(amount)){
            throw new IllegalStateException("Not enough money on your account");
        }
        balance = balance.retrieveAmount(Objects.requireNonNull(amount));
        operations.add(new Operation(new Date(), amount, balance.getBalance()));
    }

    public Balance getBalance() {
        return balance;
    }

    public void printOperations(){
        operations.forEach(Operation::print);
    }
}
