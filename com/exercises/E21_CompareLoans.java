package com.exercises;

import java.util.Scanner;

public class E21_CompareLoans
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        double numberOfYears = input.nextDouble();
        E21_Loan myLoan = new E21_Loan(loanAmount, numberOfYears, 5.0);

        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        for (int i = 0; i <= 24; i++)
        {
            double annualInterestRate = 5.0 + (i / 8.0);
            myLoan.setAnnualInterestRate(annualInterestRate);
            System.out.printf("%-17s%-19.2f%-13.2f\n",
                    String.format("%.3f", myLoan.getAnnualInterestRate()) + "%",
                    myLoan.getMonthlyPayment(),
                    myLoan.getTotalPayment());
        }
    }
}
