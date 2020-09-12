package com.listings;

import java.util.Scanner;

public class L05_SentinelValue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (0 to finish): ");
        int data = input.nextInt();
        int sum = 0;

        while (data != 0)
        {
            sum += data;
            System.out.print("Enter an integer (0 to finish): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
