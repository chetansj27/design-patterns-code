package lld.bookmyshow.code;

import lld.bookmyshow.code.models.PaymentStatus;

import java.util.Date;

public abstract class Payment {
    private double amount;
    private Date createdOn;
    private int transactionId;
    private PaymentStatus status;
}
