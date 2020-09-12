package com.listings;

public class L07_MultiplicationTable
{
    public static void main(String[] args)
    {
        System.out.println("Multiplication Table");
        System.out.print("     ");

        for (int i = 1; i <= 15; i++)
            System.out.printf("%5d", i);

        System.out.println();
        for (int i = 1; i <= 16; i++)
            System.out.print("-----");

        for (int i = 1; i <= 15; i++)
        {
            System.out.printf("\n%2d | ", i);

            for (int j = 1; j <= 15; j++)
                System.out.printf("%5d", i * j);
        }
    }
}
