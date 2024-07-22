package lld.atm.code.state;

import lld.atm.code.ATM;
import lld.atm.code.Card;

public class CheckBalanceState implements ATMState {

    public CheckBalanceState() {
    }

    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println("Your Balance is: " + card.getAccountBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}


