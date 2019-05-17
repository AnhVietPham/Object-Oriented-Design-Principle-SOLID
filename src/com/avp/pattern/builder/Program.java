package com.avp.pattern.builder;

import java.util.Date;

public class Program {
    public static void main(String args[]) {
        Date today = new Date();
        Date startDate = today;
        Date maturity = new Date();
        Date maturityDate = maturity;
        Double coupon = 1.0;
        Double yield = 1.0;
        Double notional = 1000.0;

        /**
         * BondA with only mandatory properties
         * */
        Bond bondA = new BondBuilder(startDate, maturityDate, coupon, yield, notional)
                .BuildBond();

        /**
         * BondB with mandatory and issuer name properties
         **/
        Bond bondB = new BondBuilder(startDate, maturityDate, coupon, yield, notional)
                .withBondHolderName("Issuer Name")
                .BuildBond();

        /**
         * BondC with mandatory, issuer and holder name
         * */
        Bond bondC = new BondBuilder(startDate, maturityDate, coupon, yield, notional)
                .withBondIssuerName("Issuer Name")
                .withBondHolderName("Holder Name")
                .BuildBond();

        System.out.println(bondA.toString());
        System.out.println(bondB.toString());
        System.out.println(bondC.toString());


    }
}
