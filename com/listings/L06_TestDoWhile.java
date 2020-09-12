package com.listings;

import java.util.Scanner;

public class L06_TestDoWhile
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int data = 0;

        do
        {
            sum += data;
            System.out.print("Enter an integer (0 to finish): ");
            data = input.nextInt();
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
