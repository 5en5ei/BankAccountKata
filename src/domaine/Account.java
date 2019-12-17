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

    public String printOperations(){
        StringBuilder stringBuilder = new StringBuilder();
        operations.forEach(op -> stringBuilder.append(op).append("\n"));
        String opString = stringBuilder.toString();
        return opString.substring(0, opString.length() -1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getBalance().equals(account.getBalance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBalance());
    }
}
