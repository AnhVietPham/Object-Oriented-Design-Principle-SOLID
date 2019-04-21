package com.avp.isp;

class AccountReceivable {
    private Accounting transactionObject;

    AccountReceivable(Accounting accounting){
        this.transactionObject = accounting;
    }

    void postPayment(){
        transactionObject.chargeCustomer();
    }

    void sendInvoice(){
        transactionObject.prepareInvoice();
    }
}
