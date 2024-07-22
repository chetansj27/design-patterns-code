package lld.atm.code.state;

public enum OperationType {
    CASH_WITHDRAWAL,
    BALANCE_CHECK,
    PRINT_STATEMENT;

    public static void showAllTransactionTypes() {
        for (OperationType type : OperationType.values()) {
            System.out.println(type.name());
        }
    }

}
