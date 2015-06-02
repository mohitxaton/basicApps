package com.company;

/**
 * Created by mohit on 06-03-2015.
 */
public enum TransactionTypeEnum {



    SELL		         (1, "SELL"),
    WITHDRAW		     (2, "WITHDRAW"),
    BUY                  (3, "BUY"),
    DEPOSIT              (4, "DEPOSIT");



    private long id;
    private String transactionTypeText;


    private TransactionTypeEnum(long id, String transactionTypeText) {
        this.id = id;
        this.transactionTypeText = transactionTypeText;

    }

    public long getId() {
        return id;
    }

    public String transactionType() {
        return transactionTypeText;
    }
}
