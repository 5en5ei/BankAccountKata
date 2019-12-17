package domaine;

public enum OperationsEnum {
    DEPOSIT("Deposit"), WITHDRAW("Withdraw"), NEW_ACCOUNT("New account");

    final String value;

    OperationsEnum(String operation){
        this.value = operation;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
