package domaine;

class Balance {
    private Amount amount;

    Balance(Amount amount) {
        this.amount = amount;
    }

    Amount getBalance() {
        return amount;
    }

    void setBalance(Amount newAmount) {
        amount = new Amount(newAmount.getAmount());
    }

    void addCurrency(Amount amountAdded){
        amount = new Amount(amount.getAmount() + amountAdded.getAmount());
    }

    void retrieveCurrency(Amount amountAdded){
        amount = new Amount(amount.getAmount() - amountAdded.getAmount());
    }

    boolean NotEnoughMoney(Amount amountRetrieved) {
        return amount.getAmount() < amountRetrieved.getAmount();
    }
}