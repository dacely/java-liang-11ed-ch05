package com.exercises;

public class E24_SumSeries
{
    public static void main(String[] args)
    {
        double sum = 0;

        for (int i = 1; i <= 97; i++)
            sum += i / (i + 2.0);

        System.out.printf("Sum = %.10f", sum);
    }
}
