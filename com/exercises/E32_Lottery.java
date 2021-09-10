package com.exercises;

import java.util.Scanner;

public class E32_Lottery
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int userNumber = input.nextInt();
        int lotteryResult = 0;

        do
            lotteryResult = (int) (Math.random() * 100);
        while (lotteryResult % 11 == 0);

        System.out.printf("The lottery number is: %02d \n", lotteryResult);

        if (userNumber == lotteryResult){
            System.out.println("Exact match: you win $10,000");}
        else
        {
            int x1 = lotteryResult / 10;
            int x2 = lotteryResult % 10;
            int y1 = userNumber / 10;
            int y2 = userNumber % 10;

            if (x1 == y2 && x2 == y1)
                System.out.println("Match all digits: you win $3,000");
            else if (x1 == y1 || x1 == y2 || x2 == y1 || x2 == y2)
                System.out.println("Match one digit: you win $1,000");
            else
                System.out.println("Sorry: no match");
        }
    }
}
