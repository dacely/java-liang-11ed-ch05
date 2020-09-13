package com.exercises;

public class E10_FindNumbers
{
    public static void main(String[] args)
    {
        int found = 0;
        for (int i = 100; i <= 1000; ++i)
        {
            if (i % 3 == 0 && i % 4 == 0)
            {
                System.out.printf("%d ", i);
                ++found;

                if (found % 10 == 0)
                    System.out.println();
            }
        }
    }
}
