package com.avp.isp;

public class ReportGenerator {
    private Reporting transactionObject;

    public ReportGenerator(Reporting reporting){
        this.transactionObject = reporting;
    }

    public void generateReport() {
        System.out.println(transactionObject.getName() + " " + transactionObject.productBreakDown() + " " + transactionObject.getDate());
    }
}
