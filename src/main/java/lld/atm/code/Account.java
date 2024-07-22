package lld.atm.code;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private String accountNumber;
    private int balance;
    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdrawAmount(int amount) {
        balance -= amount;
    }
}
