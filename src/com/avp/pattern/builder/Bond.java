package com.avp.pattern.builder;

import java.util.Date;

public class Bond {
    private Date maturityDate;
    private Date startDate;
    private double coupon;
    private double yieldRate;
    private double notional;
    private String bondHolderName;
    private String bondIssuerName;

    public Bond(Date maturityDate, Date startDate, double coupon, double yieldRate, double notional) {
        this.maturityDate = maturityDate;
        this.startDate = startDate;
        this.coupon = coupon;
        this.yieldRate = yieldRate;
        this.notional = notional;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public double getCoupon() {
        return coupon;
    }

    public void setCoupon(double coupon) {
        this.coupon = coupon;
    }

    public double getYieldRate() {
        return yieldRate;
    }

    public void setYieldRate(double yieldRate) {
        this.yieldRate = yieldRate;
    }

    public double getNotional() {
        return notional;
    }

    public void setNotional(double notional) {
        this.notional = notional;
    }

    public String getBondHolderName() {
        return bondHolderName;
    }

    public void setBondHolderName(String bondHolderName) {
        this.bondHolderName = bondHolderName;
    }

    public String getBondIssuerName() {
        return bondIssuerName;
    }

    public void setBondIssuerName(String bondIssuerName) {
        this.bondIssuerName = bondIssuerName;
    }
}
