package com.exercises;

import java.util.Scanner;

public class E22_LoanAmortization
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        double numberOfYears = input.nextDouble();
        int numberOfMonths = (int) (numberOfYears * 12);
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        E21_Loan myLoan = new E21_Loan(loanAmount, numberOfYears, annualInterestRate);

        System.out.printf("\nMonthly Payment: %.2f\n", myLoan.getMonthlyPayment());
        System.out.printf("Total Payment: %.2f\n\n", myLoan.getTotalPayment());

        System.out.println("Payment#  Interest  Principal  Balance");

        for (int month = 1; month <= numberOfMonths; month++)
        {
            double interest = myLoan.getNextMonthInterest();
            double principal = myLoan.getMonthlyPayment() - interest;
            myLoan.makePayment();
            double balance = myLoan.getBalance();

            System.out.printf("%-8d%10.2f%11.2f%9.2f\n", month, interest, principal, balance);
        }
    }
}
