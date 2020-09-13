package com.exercises;

import java.util.Scanner;

public class E14_GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese priemer entero: ");
        int n1 = input.nextInt();
        System.out.print("Ingrese segundo entero: ");
        int n2 = input.nextInt();
        int d = Math.min(n1, n2);
        int gcd = 1;

        while (d > 2)
        {
            if (n1 % d == 0 && n2 % d == 0)
            {
                gcd = d;
                break;
            }
            else
                --d;
        }

        System.out.printf("El Maximo Comun Divisor de %d y %d es %d", n1, n2, gcd);
    }
}
