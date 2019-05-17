package com.avp.pattern.builder;

import java.util.Date;

class BondBuilder {
    private Bond bond;

    /**
     * Mandatory bond properties
     */
    BondBuilder(Date maturityDate, Date startTime, double coupon, double yieldRate, double notional) {
        bond = new Bond(maturityDate, startTime, coupon, yieldRate, notional);
    }

    /**
     * Optional bond properties
     */
    BondBuilder withBondIssuerName(String bondIssuerName) {
        bond.setBondIssuerName(bondIssuerName);
        return this;
    }

    BondBuilder withBondHolderName(String bondHolderName){
        bond.setBondHolderName(bondHolderName);
        return this;
    }

    Bond BuildBond(){
        return bond;
    }


}
