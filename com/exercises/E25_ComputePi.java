package com.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class E25_ComputePi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Con cuantos términos en la serie desea aproximar \u03C0: ");
        final long NUMBER_OF_TERMS = input.nextLong();

        double dbPI = 1;
        BigDecimal bigPI = BigDecimal.ONE;
        for (long i = 2; i < NUMBER_OF_TERMS; i++)
        {
            double a = i % 2 == 0 ? -1.0 : 1.0;
            double b = (2.0 * i) - 1.0;
            dbPI += a / b;

            BigDecimal A = BigDecimal.valueOf(a);
            BigDecimal B = BigDecimal.valueOf(b);
            BigDecimal C = A.divide(B,20, RoundingMode.HALF_DOWN);
            bigPI = bigPI.add(C);
        }
        dbPI *= 4;
        bigPI = bigPI.multiply(BigDecimal.valueOf(4));

        System.out.printf("Double:     %.20f\n", dbPI);
        System.out.printf("            %.20f\n", Math.PI);
        System.out.printf("BigDecimal: %s", bigPI);
    }
}
