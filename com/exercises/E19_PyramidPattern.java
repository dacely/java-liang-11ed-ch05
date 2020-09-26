package com.exercises;

public class E19_PyramidPattern
{
    public static void main(String[] args)
    {
        final int PYRAMID_SIZE = 15;
        int colSize;
        int exp;

        for (int r = 0; r <= PYRAMID_SIZE; r++)
        {
            for (int c = 0; c <= PYRAMID_SIZE; c++)
            {
                colSize = 2 +  c / 2;
                exp = r + c - PYRAMID_SIZE;
                if (exp >= 0)
                {
                    System.out.printf("%" + colSize + "d", (int) Math.pow(3, exp));
                }
                else
                    System.out.printf("%" + colSize + "s"," ");
            }

            for (int c = PYRAMID_SIZE - 1; c >= 0; c--)
            {
                colSize = 2 +  c / 2;
                exp = r + c - PYRAMID_SIZE;
                if (exp >= 0)
                {
                    System.out.printf("%" + colSize + "d", (int) Math.pow(3, exp));
                }
                else
                    System.out.printf("%" + colSize + "s"," ");
            }

            System.out.println();
        }
    }
}
