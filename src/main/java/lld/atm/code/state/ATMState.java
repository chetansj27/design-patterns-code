package lld.atm.code.state;

import lld.atm.code.ATM;
import lld.atm.code.Card;

public interface ATMState {
    default void insertCard(ATM atm, Card card) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void returnCard() {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void withdrawCash(ATM atmObject, Card card, int amount) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void authenticatePin(ATM atm, Card card, int pin) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void checkBalance(ATM atm, Card card) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void selectOperation(ATM atmObject, Card card, OperationType operationType) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void printStatement(ATM atmObject, Card card) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void exit(ATM atm) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void printTransactionReceipt(ATM atmObject, boolean printReceipt) {
        throw new UnsupportedOperationException("Method not supported");
    }
}
