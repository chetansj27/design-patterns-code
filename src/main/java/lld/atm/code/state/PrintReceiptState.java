package lld.atm.code.state;

import lld.atm.code.ATM;
import lld.atm.code.Transaction;

public class PrintReceiptState implements ATMState {
    private final Transaction transaction;

    public PrintReceiptState(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void printTransactionReceipt(ATM atmObject, boolean printReceipt) {
        if (printReceipt) {
            System.out.println("Your transaction of amount: " + transaction.getAmount() + " executed at " + transaction.getTransactionTime());
        }
        exit(atmObject);
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
