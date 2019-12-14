package domaine;

public class Account {

    private final Balance balance = new Balance();

    public Account(int amount) {
        this.balance.setBalance(amount);
    }

    public void deposit(int amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        balance.setBalance(+amount);
    }

    public void withdraw(int amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        if(amount > balance.getBalance()){
            throw new IllegalArgumentException("Not enough money on your account");
        }
        balance.setBalance(-amount);
    }

    public Balance getBalance() {
        return balance;
    }
}
