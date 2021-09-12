package com.exercises;

public class E42_Combinations_nC3
{
    public static void main(String[] args)
    {
        final int n = 7;
        int count = 0;

        for (int i = 1; i <= n; i++)
        {
            for (int j = i + 1; j <= n; j++)
            {
                for (int k = j + 1; k <= n; k++)
                {
                    System.out.printf("(%d, %d, %d)\n", i, j, k);
                    ++count;
                }
            }
        }

        System.out.println("Total combinations: " + count);
    }
}
