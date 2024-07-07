package lld.vendingmachine.code.states;

import lld.vendingmachine.code.Product;
import lld.vendingmachine.code.VendingMachine;

public class ProductSelectionState implements VendingMachineState {
    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Product product = machine.getInventory().getProduct(codeNumber);

        int paidByUser = machine.getTotalPayment();
        if (paidByUser < product.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + product.getPrice() + " and you paid: " + paidByUser);
            cancelProduct(machine);
            throw new Exception("insufficient amount");
        } else {
            if (paidByUser > product.getPrice()) {
                getChange(paidByUser - product.getPrice());
            }
            machine.setVendingMachineState(new ProductDispenseState(machine, codeNumber));
        }
    }

    @Override
    public int cancelProduct(VendingMachine machine) {
        System.out.println("Returned the full amount back in the Cash Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getTotalPayment();
    }

    @Override
    public int getChange(int returnExtraMoney) {
        System.out.println("Returned the change in the Cash Dispense Tray: " + returnExtraMoney);
        return returnExtraMoney;

    }
}
