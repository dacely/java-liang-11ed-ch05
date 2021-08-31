package com.exercises;

public class E18_Patterns
{
    public static void main(String[] args)
    {
        drawPatternA();
        drawPatternB();
        drawPatternC();
        drawPatternD();
    }

    private static void drawPatternA()
    {
        System.out.println("Pattern A");

        for (int i = 1; i <= 6; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%-2d", j);
            }

            System.out.println();
        }

        System.out.println("\n");
    }

    private static void drawPatternB()
    {
        System.out.println("Pattern B");

        for (int i = 6; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%-2d", j);
            }

            System.out.println();
        }

        System.out.println("\n");
    }

    private static void drawPatternC()
    {
        System.out.println("Pattern C");

        for (int i = 1; i <= 6; i++)
        {
            for (int j = 6; j >= 1; j--)
                System.out.print(j <= i ? j + " " : "  ");

            System.out.println();
        }

        System.out.println("\n");
    }

    private static void drawPatternD()
    {
        System.out.println("Pattern D");

        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < i; j++)
                System.out.print("  ");

            for (int j = 1; j <= 6 - i; j++)
                System.out.printf("%-2d", j);

            System.out.println();
        }

        System.out.println("\n");
    }
}
