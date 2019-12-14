package domaine;

public class Account {

    private int balance;


    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        balance+= amount;
    }

    public void withdraw(int amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Not enough money on your account");
        }
        balance-=amount;
    }
}
