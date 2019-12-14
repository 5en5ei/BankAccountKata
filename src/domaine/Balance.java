package domaine;

class Balance {
    private Amount amount;

    Balance(Amount amount) {
        this.amount = amount;
    }

    Amount getBalance() {
        return amount;
    }

    Balance addAmount(Amount amountAdded){
       return new Balance(amount.addMoney(amountAdded));
    }

    Balance retrieveAmount(Amount amountAdded){
       return new Balance(amount.retrieveMoney(amountAdded));
    }

    boolean NotEnoughMoney(Amount amountRetrieved) {
        return amount.getAmount() < amountRetrieved.getAmount();
    }
}