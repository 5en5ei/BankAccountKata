package domaine;

public class Account {

    private Balance balance;

    public Account(Amount amount) {
        balance = new Balance(amount);
    }

    public void deposit(Amount amount) {
        if(amount.isNegative()){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        balance.setBalance(balance.getBalance()+amount.getAmount());
    }

    public void withdraw(Amount amount) {
        if(amount.isNegative()){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        if(amount.getAmount() > balance.getBalance()){
            throw new IllegalArgumentException("Not enough money on your account");
        }
        balance.setBalance(balance.getBalance()-amount.getAmount());
    }

    public int getBalance() {
        return balance.getBalance();
    }
}
