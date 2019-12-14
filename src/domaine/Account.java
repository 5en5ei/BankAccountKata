package domaine;

public class Account {

    private int balance;


    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposite(int amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount should be 0 or positive");
        }
        balance+= amount;
    }
}
