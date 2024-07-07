package lld.vendingmachine.code;

import lld.vendingmachine.code.states.IdleState;
import lld.vendingmachine.code.states.VendingMachineState;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendingMachine {
    private VendingMachineState vendingMachineState;
    private Inventory inventory;
    private int totalPayment;

    public VendingMachine() {
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        totalPayment = 0;
    }


    public static VendingMachine getInstance() {
        return VendingMachine.InnerClass.singletonObj;

    }

    private static class InnerClass {
        private static final VendingMachine singletonObj = new VendingMachine();
    }
}
