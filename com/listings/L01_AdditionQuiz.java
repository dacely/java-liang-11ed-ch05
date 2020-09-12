package com.listings;

import java.util.Scanner;

public class L01_AdditionQuiz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        System.out.printf("What is %d + %d? ", n1, n2);
        int ans = input.nextInt();

        while (ans != n1 + n2)
        {
            System.out.println("Wrong answer. Try again.");
            System.out.printf("What is %d + %d? ", n1, n2);
            ans = input.nextInt();
        }

        System.out.print("You got it! ");
    }
}
