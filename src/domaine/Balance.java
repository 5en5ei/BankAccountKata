package domaine;

public class Balance {
    private Amount amount;

    Balance(Amount amount) {
        this.amount = amount;
    }

    int getBalance() {
        return amount.getAmount();
    }

    void setBalance(int newAmount) {
        amount = new Amount(newAmount);
    }
}