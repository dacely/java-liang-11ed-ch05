package com.exercises;

public class E21_Loan
{
    private double loanAmount;
    private double numberOfYears;
    private double annualInterestRate;
    private double balance;

    public E21_Loan(double loanAmount, double numberOfYears, double annualInterestRate)
    {
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        this.annualInterestRate = annualInterestRate;
        this.balance = getTotalPayment();
    }

    //region Getters and Setters
    public double getLoanAmount()
    {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }

    public double getNumberOfYears()
    {
        return numberOfYears;
    }

    public void setNumberOfYears(double numberOfYears)
    {
        this.numberOfYears = numberOfYears;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance()
    {
        return balance;
    }
    //endregion

    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 1200;
    }

    public double getMonthlyPayment()
    {
        return getLoanAmount() * getMonthlyInterestRate() /
                (1 - 1 / Math.pow(1 + getMonthlyInterestRate(), getNumberOfYears() * 12));
    }

    public double getTotalPayment()
    {
        return getMonthlyPayment() * getNumberOfYears() * 12;
    }

    public void makePayment()
    {
        balance -= getMonthlyPayment();
    }

    public double getNextMonthInterest()
    {
        return getBalance() * getMonthlyInterestRate();
    }


}
