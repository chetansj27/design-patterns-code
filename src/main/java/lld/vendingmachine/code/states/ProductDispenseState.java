package lld.vendingmachine.code.states;

import lld.vendingmachine.code.Product;
import lld.vendingmachine.code.VendingMachine;

public class ProductDispenseState implements VendingMachineState {
    ProductDispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public Product dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Product product = machine.getInventory().getProduct(codeNumber);
        machine.getInventory().updateSoldOutProduct(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return product;
    }


}
