package com.avp.pattern.builder;

import java.util.Date;

public class BondBuilder {
    private Bond bond;

    /**
     * Mandatory bond properties
     */
    public BondBuilder(Date maturityDate, Date startTime, double coupon, double yieldRate, double notional) {
        bond = new Bond(maturityDate, startTime, coupon, yieldRate, notional);
    }

    /**
     * Optional bond properties
     */
    public BondBuilder withBondIssuerName(String bondIssuerName) {
        bond.setBondIssuerName(bondIssuerName);
        return this;
    }

    public BondBuilder withBondHolderName(String bondHolderName){
        bond.setBondHolderName(bondHolderName);
        return this;
    }

    public Bond BuildBond(){
        return bond;
    }


}
