package lld.vendingmachine.code.states;

import lld.vendingmachine.code.Product;
import lld.vendingmachine.code.VendingMachine;
import lld.vendingmachine.code.Coin;
import lld.vendingmachine.code.Note;

import java.util.List;

public interface VendingMachineState {
    default void clickOnInsertCoinButton(VendingMachine machine) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void clickOnStartProductSelectionButton(VendingMachine machine) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void insertCoin(VendingMachine machine, Coin coin) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void insertNote(VendingMachine machine, Note note) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new UnsupportedOperationException("Method not supported");
    }

    default int getChange(int returnChangeMoney) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default Product dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new UnsupportedOperationException("Method not supported");
    }

    default int cancelProduct(VendingMachine machine) {
        throw new UnsupportedOperationException("Method not supported");
    }

    default void updateInventory(VendingMachine machine, Product product, int codeNumber) throws Exception {
        throw new UnsupportedOperationException("Method not supported");
    }

}
