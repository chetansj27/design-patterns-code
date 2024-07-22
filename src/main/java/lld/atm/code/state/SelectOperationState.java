package lld.atm.code.state;

import lld.atm.code.ATM;
import lld.atm.code.Card;

public class SelectOperationState implements ATMState {

    public SelectOperationState() {
        showOperations();
    }

    @Override
    public void selectOperation(ATM atmObject, Card card, OperationType operationType) {

        switch (operationType) {
            case CASH_WITHDRAWAL:
                atmObject.setCurrentATMState(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atmObject.setCurrentATMState(new CheckBalanceState());
                break;
            case PRINT_STATEMENT:
                atmObject.setCurrentATMState(new PrintStatementState());
                break;
            default: {
                System.out.println("Invalid Option");
                exit(atmObject);
            }
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

    private void showOperations() {
        System.out.println("Please select the Operation");
        OperationType.showAllTransactionTypes();
    }
}
