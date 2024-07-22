package lld.atm.code;

import lld.atm.code.state.OperationType;

import java.util.Calendar;
import java.util.Date;

public class DemoClass {
    public static void main(String[] args) {
        ATM atm = ATM.getATMObject();
        atm.setAtmBalance(1200, 2, 2);
        Customer customer = new Customer("1", "chetan", "email", "8821", "address");
        Account account = new Account("12841301", 700);
        customer.setAccount(account);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, 5);
        Card card = new Card("1131121", calendar.getTime(), 431, account);

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Account Balance: " + card.getAccountBalance());
        atm.printCurrentATMStatus();

        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++\n");

        atm.getCurrentATMState().insertCard(atm, card);
        atm.getCurrentATMState().authenticatePin(atm, card, 1256);
        atm.getCurrentATMState().selectOperation(atm, card, OperationType.CASH_WITHDRAWAL);
        atm.getCurrentATMState().withdrawCash(atm, card, 700);
        atm.getCurrentATMState().printTransactionReceipt(atm, true);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        atm.getCurrentATMState().insertCard(atm, card);
        atm.getCurrentATMState().authenticatePin(atm, card, 1256);
        atm.getCurrentATMState().selectOperation(atm, card, OperationType.BALANCE_CHECK);
        atm.getCurrentATMState().checkBalance(atm, card);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        atm.getCurrentATMState().insertCard(atm, card);
        atm.getCurrentATMState().authenticatePin(atm, card, 1256);
        atm.getCurrentATMState().selectOperation(atm, card, OperationType.PRINT_STATEMENT);
        atm.getCurrentATMState().printStatement(atm, card);

        atm.printCurrentATMStatus();

    }
}
