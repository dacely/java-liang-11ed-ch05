package com.exercises;

import java.util.Scanner;

public class E36_CheckISBN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();
        int isbnCopy = isbn;
        int sum = 0;
        int d;

        for (int i = 9; i >= 1; i--)
        {
            d = isbn % 10;
            sum += i * d;
            isbn /= 10;
        }

        d = sum % 11;
        System.out.printf("The ISBN-10 number is %09d%s", isbnCopy, d == 10 ? "X" : d);
    }
}
