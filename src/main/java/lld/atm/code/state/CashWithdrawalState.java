package lld.atm.code.state;

import lld.atm.code.ATM;
import lld.atm.code.Card;
import lld.atm.code.amountwithdrawl.CashWithdrawProcessor;
import lld.atm.code.amountwithdrawl.FiveHundredWithdraw;
import lld.atm.code.amountwithdrawl.OneHundredWithdraw;

public class CashWithdrawalState implements ATMState {

    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    @Override
    public void withdrawCash(ATM atmObject, Card card, int withdrawalAmountRequest) {

        if (atmObject.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if (card.getAccountBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atmObject);
        } else {
            var transaction = card.deductAccountBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);
            CashWithdrawProcessor withdrawProcessor =
                    new FiveHundredWithdraw(new OneHundredWithdraw(null));

            withdrawProcessor.withdraw(atmObject, withdrawalAmountRequest);
            atmObject.setCurrentATMState(new PrintReceiptState(transaction));
        }
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

