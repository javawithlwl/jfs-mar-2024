package com.careerit.jfs.cj.basics.enumex;

import java.util.List;

public class InvoiceManager {

    public static void main(String[] args) {



        List<Invoice> invoices = getInvoices();

        // Find all the approved invoices and print the invoice number and amount

        for(Invoice invoice: invoices){
            if(invoice.getStatus() == (ApprovalStatus.APPROVED)){
                System.out.println("Invoice number : "+invoice.getInvoiceNo()+" Amount : "+invoice.getAmount());
            }
        }

    }

    private static boolean isEquals(String str1,String str2){
        if(str1 == null && str2 == null){
            return true;
        }
        if(str1 == null || str2 == null){
            return false;
        }
        return str1.equals(str2);
    }

    private static List<Invoice> getInvoices() {
        return List.of(new Invoice("INV-001", 1000, ApprovalStatus.SUBMITTED),
                new Invoice("INV-002", 2000, ApprovalStatus.APPROVED),
                new Invoice("INV-003", 3000, ApprovalStatus.REJECTED),
                new Invoice("INV-004", 5000, ApprovalStatus.PENDING),
                new Invoice("INV-005", 5000, ApprovalStatus.SUBMITTED),
                new Invoice("INV-006", 4000, ApprovalStatus.APPROVED),
                new Invoice("INV-007", 7000, ApprovalStatus.REJECTED),
                new Invoice("INV-008", 8000, ApprovalStatus.PENDING),
                new Invoice("INV-009", 9000, ApprovalStatus.SUBMITTED),
                new Invoice("INV-010", 10000, null)

        );
    }
}
