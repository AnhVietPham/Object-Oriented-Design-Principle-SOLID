package com.avp.isp;

public class AccountReceivable {
    private Accounting transactionObject;

    public AccountReceivable(Accounting accounting){
        this.transactionObject = accounting;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
    }
}
