package com.devflection.bank.models;

import java.math.BigDecimal;

public class Mortgage {

    private final String name;
    private final BigDecimal loanAmount;
    private final BigDecimal interestRate;
    private final int duration;

    public Mortgage(String name, BigDecimal loanAmount, BigDecimal interestRate, int duration) {
        this.name = name;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public BigDecimal getTotalAmountDue() {
        return loanAmount.add(loanAmount.multiply(interestRate));
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Mortgage for %s with the amount %s has interest rate %s and is for %s months",
                             getName(), getLoanAmount(), getInterestRate(), getDuration());
    }
}
