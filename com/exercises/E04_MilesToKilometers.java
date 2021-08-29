package com.exercises;

public class E04_MilesToKilometers
{
    public static void main(String[] args)
    {
        System.out.println("Miles \u2502 Kilometers");
        double iKm = 0.0;
        final double RATIO = 1.609344;

        for (int i = 1; i <= 200; i++)
        {
            iKm = i * RATIO;
            System.out.printf("%4d  \u2502%11.3f\n", i,  iKm);
        }
    }
}
