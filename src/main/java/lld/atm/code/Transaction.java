package lld.atm.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {
    private String transactionId;
    private int amount;
    private Date transactionTime;
    private String accountNumber;
}
