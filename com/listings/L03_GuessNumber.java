package com.listings;

import java.util.Scanner;

public class L03_GuessNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int magicNumber = (int) (Math.random() * 101);

        System.out.println("Guess a magic number between 0 and 100");
        int guess = -1;
        while (guess != magicNumber)
        {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == magicNumber)
                System.out.println("Yes, the number is " + magicNumber);
            else if (guess > magicNumber)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
}
