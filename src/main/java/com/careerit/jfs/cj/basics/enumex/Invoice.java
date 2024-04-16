package com.careerit.jfs.cj.basics.enumex;


public class Invoice {

    private String invoiceNo;
    private double amount;
    private ApprovalStatus status;

    public Invoice(String invoiceNo, double amount, ApprovalStatus status) {
        this.invoiceNo = invoiceNo;
        this.amount = amount;
        this.status = status;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ApprovalStatus getStatus() {
        return status;
    }

    public void setStatus(ApprovalStatus status) {
        this.status = status;
    }
}
