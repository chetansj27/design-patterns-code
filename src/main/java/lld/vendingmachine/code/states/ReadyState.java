package lld.vendingmachine.code.states;

import lld.vendingmachine.code.Coin;
import lld.vendingmachine.code.Note;
import lld.vendingmachine.code.VendingMachine;

import java.util.List;

public class ReadyState implements VendingMachineState {
    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        machine.setVendingMachineState(new ProductSelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Accepted the coin");
        machine.setTotalPayment(machine.getTotalPayment() + coin.getValue());
    }

    @Override
    public void insertNote(VendingMachine machine, Note note) {
        System.out.println("Accepted the note");
        machine.setTotalPayment(machine.getTotalPayment() + note.getValue());
    }

    @Override
    public int cancelProduct(VendingMachine machine) {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getTotalPayment();
    }


}
