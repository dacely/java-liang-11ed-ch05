package com.exercises;

import java.util.Scanner;

public class E16_PrimeFactors
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        int n = input.nextInt();

        int i = 2;
        while (n > 1)
        {
            if (n % i == 0)
            {
                System.out.printf("%d, ", i);
                n /= i;
            }
            else
                ++i;
        }
    }
}
