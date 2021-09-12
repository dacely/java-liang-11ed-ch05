package com.exercises;

public class E42_Permutations_nP3
{
    public static void main(String[] args)
    {
        final int n = 7;
        int count = 0;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (j == i)
                    continue;

                for (int k = 1; k <= n; k++)
                {
                    if (k == i || k == j)
                        continue;

                    System.out.printf("(%d, %d, %d)\n", i, j, k);
                    ++count;
                }
            }
        }

        System.out.println("Total permutations: " + count);
    }
}
