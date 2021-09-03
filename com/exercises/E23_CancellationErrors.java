package com.exercises;

public class E23_CancellationErrors
{
    public static void main(String[] args)
    {
        final long N = 500_000;
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 1; i < N; i++)
            sum1 += 1.0 / i;

        for (long i = N; i >= 1  ; i--)
            sum2 += 1.0 / i;

        System.out.printf("Partial sum of Harmonic Series with %d terms\n", N);
        System.out.printf("Left to right: %.10f\n", sum1);
        System.out.printf("Right to left: %.10f", sum2);
    }
}
