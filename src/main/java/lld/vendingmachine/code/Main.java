package lld.vendingmachine.code;

import lld.vendingmachine.code.states.VendingMachineState;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = VendingMachine.getInstance();
        try {

            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            vendingMachine.getInventory().displayInventory();

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");
            //current state is idle state
            VendingMachineState vendingState = vendingMachine.getVendingMachineState();
            // state is readyState
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.FIVE);
            vendingState.insertCoin(vendingMachine, Coin.TEN);
            vendingState.insertNote(vendingMachine, Note.FIFTY);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            vendingState.clickOnStartProductSelectionButton(vendingMachine);

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 101);
            vendingState.chooseProduct(vendingMachine, 101);

            vendingMachine.getInventory().displayInventory();

        } catch (Exception e) {
            vendingMachine.getInventory().displayInventory();
        }


    }

}
