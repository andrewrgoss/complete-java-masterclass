package com.andrewgoss;

public class BankAcct {
    private int acctNumber;
    private double acctBalance;
    private String acctFullName;
    private String acctEmail;
    private String acctPhone;

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public int getAcctNumber() {
        return this.acctNumber;
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }

    public double getAcctBalance() {
        return this.acctBalance;
    }

    public void setAcctFullName(String acctFullName) {
        this.acctFullName = acctFullName;
    }

    public String getAcctFullName() {
        return this.acctFullName;
    }

    public void setAcctEmail(String acctEmail) {
        this.acctEmail = acctEmail;
    }

    public String getAcctEmail() {
        return this.acctEmail;
    }

    public void setAcctPhone(String acctPhone) {
        this.acctPhone = acctPhone;
    }

    public String getAcctPhone() {
        return this.acctPhone;
    }

    public double makeDeposit(double depositAmt) {
        acctBalance = acctBalance + depositAmt;
        return this.acctBalance;
    }

    public double makeWithdrawal(double withdrawalAmt) {
        acctBalance = acctBalance - withdrawalAmt;
        return this.acctBalance;
    }

}
