package com.company;

/**
 * Created by mohit on 06-03-2015.
 */
public class OutputReportLinePojo {

    private String clientId;
    private String transactionType;
    private String transactionDate;
    private String priority;
    private double processingFee;
    private String securityId;
    private String transactionId;

    public int OutputReportLinePojo() {
          return 0;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }


    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    /*public String getSortingKey(){
        *//*Report should further be sorted by the
        Client Id, Transaction Type, Transaction Date and Priority*//*

        return this.getClientId() + this.getTransactionType() + this.getTransactionDateAsYYYYMMDD() + this.getPriorityAsSortKey();

    }*/

    public String getTransactionDateAsYYYYMMDD() throws ArrayIndexOutOfBoundsException {
        String data[] = this.getTransactionDate().split("/");
        return data[2] + data [0] + data[1];
    }

    public String getPriorityAsSortKey() {
        if(this.getPriority().equalsIgnoreCase("Y")){
            return "A";
        }else {
            return "Z";
        }

    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
