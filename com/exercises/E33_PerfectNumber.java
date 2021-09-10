package com.exercises;

public class E33_PerfectNumber
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10_000; i++)
        {
            int sumOfDivisors = 0;
            int mid = (int) Math.ceil(i /2.0);

            for (int j = 1; j <= mid; j++)
            {
                if (i % j == 0)
                    sumOfDivisors += j;
            }

            if (i == sumOfDivisors)
            {
                System.out.println(i);
            }
        }
    }
}
