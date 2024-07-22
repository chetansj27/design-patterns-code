package lld.atm.code;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Card {
    private String cardNumber;
    private Date expiryDate;
    private int cvv;
    private int pinNumber = 1256;
    private Account account;
    private List<Transaction> transactionList;


    public Card(String cardNumber, Date expiryDate, int cvv, Account account) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.account = account;
        transactionList = new ArrayList<>();
    }

    public boolean isValidPin(int pin) {
        return pin == pinNumber;
    }

    public int getAccountBalance() {
        return account.getBalance();
    }

    public Transaction deductAccountBalance(int amount) {
        account.withdrawAmount(amount);
        return recordTransaction(amount);
    }

    private Transaction recordTransaction(int amount) {
        var transaction = new Transaction(UUID.randomUUID().toString(), amount, new Date(), this.account.getAccountNumber());
        transactionList.add(transaction);
        return transaction;
    }

    public void getTransactions() {
        transactionList.forEach(transaction -> {
            System.out.println("\nTransaction details\n");
            System.out.println(transaction.getTransactionId() + " transaction for amount " + transaction.getAmount() + " executed at " + transaction.getTransactionTime());


        });
    }


}
