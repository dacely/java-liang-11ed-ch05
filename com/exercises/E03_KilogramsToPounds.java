package com.exercises;

public class E03_KilogramsToPounds
{
    public static void main(String[] args)
    {
        System.out.println("Kilograms \u2502  Pounds");
        double iPounds = 0.0;
        final double RATE = 2.20462262185;

        for (int i = 1; i <= 100; i++)
        {
            iPounds = i * RATE;
            System.out.printf("%8d  \u2502%8.1f\n", i,  iPounds);
        }
    }
}
