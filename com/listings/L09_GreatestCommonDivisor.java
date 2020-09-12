package com.listings;

import java.util.Scanner;

public class L09_GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese priemer entero: ");
        int n1 = input.nextInt();
        System.out.print("Ingrese segundo entero: ");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;
        while (k <= n1 && k <= n2)
        {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }

        System.out.printf("El Maximo Comun Divisor de %d y %d es %d", n1, n2, gcd);
    }
}
