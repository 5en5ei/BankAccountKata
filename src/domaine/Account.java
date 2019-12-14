package domaine;

public class Account {

    private Balance balance;

    public Account(int amount) {
        balance = new Balance(new Amount(amount));
    }

    public void deposit(int amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        balance.setBalance(balance.getBalance()+amount);
    }

    public void withdraw(int amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        if(amount > balance.getBalance()){
            throw new IllegalArgumentException("Not enough money on your account");
        }
        balance.setBalance(balance.getBalance()-amount);
    }

    public Balance getBalance() {
        return balance;
    }
}
