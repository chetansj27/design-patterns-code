package lld.atm.code.state;

import lld.atm.code.ATM;
import lld.atm.code.Card;

public class IdleState implements ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }

}
