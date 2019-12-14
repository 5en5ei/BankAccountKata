package domaine;

public class Amount {
    private final int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    boolean isNegative() {
        return amount < 0;
    }

    Amount addMoney(Amount amountAdded){
        return new Amount(amount + amountAdded.getAmount());
    }

    Amount  retrieveMoney(Amount amountAdded){
        return new Amount(amount - amountAdded.getAmount());
    }
}
