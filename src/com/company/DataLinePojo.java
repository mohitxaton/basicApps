package com.company;

/**
 * Created by mohit on 06-03-2015.
 */
public class DataLinePojo {


    private String transactionId;
    private String clientId;
    private String securityId;
    private String transactionType;
    private String transactionDate;
    private String marketValue;
    private String priorityFlag;


    public DataLinePojo (String commaSeparatedValues) throws ArrayIndexOutOfBoundsException {
            String[] data = commaSeparatedValues.split(",");
            transactionId = data[0];
            clientId = data[1];
            securityId = data[2];
            transactionType = data[3];
            transactionDate = data[4];
            marketValue = data[5];
            priorityFlag = data[6];
    }


    public String getPriorityFlag() {
        return priorityFlag;
    }

    public void setPriorityFlag(String priorityFlag) {
        this.priorityFlag = priorityFlag;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(String marketValue) {
        this.marketValue = marketValue;
    }

}
