package lld.vendingmachine.code.states;

import lld.vendingmachine.code.Product;
import lld.vendingmachine.code.VendingMachine;

import java.util.ArrayList;

public class IdleState implements VendingMachineState {
    public IdleState() {

    }

    public IdleState(VendingMachine vendingMachine) {
        vendingMachine.setTotalPayment(0);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new ReadyState());
    }

    @Override
    public void updateInventory(VendingMachine machine, Product product, int codeNumber) throws Exception {
        machine.getInventory().addProduct(product, codeNumber);
    }


}

