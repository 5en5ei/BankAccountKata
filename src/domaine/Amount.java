package domaine;

public class Amount {
    private final int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    int getAmount(){
        return amount;
    }

    boolean isNegative() {
        return amount < 0;
    }
}
