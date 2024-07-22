package lld.atm.code.state;

import lld.atm.code.ATM;
import lld.atm.code.Card;

public class PrintStatementState implements ATMState {
    @Override
    public void printStatement(ATM atmObject, Card card) {
        card.getTransactions();
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
