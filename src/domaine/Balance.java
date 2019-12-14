package domaine;

public class Balance {
    private int balance;

    public Balance() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        balance+=amount;
    }
}