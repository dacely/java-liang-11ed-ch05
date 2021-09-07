package com.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class E26_ComputeE
{
    public static void main(String[] args)
    {
        final int N = 30;
        BigDecimal e = BigDecimal.ONE;
        BigDecimal term = BigDecimal.ONE;

        for (int i = 1; i <= N; i++)
        {
            term = term.divide(BigDecimal.valueOf(i), 50, RoundingMode.HALF_EVEN);
            e = e.add(term);
            System.out.printf("%5d:  %.50f\n", i, e);
        }
    }
}
