package com.exercises;

import java.util.Scanner;

public class E17_DisplayPyramid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size;
        do
        {
            System.out.print("Ingrese un entero del 1 al 20: ");
            size = input.nextInt();

            if (size < 1 || size > 20)
            {
                System.out.println("\tEl valor ingresado no es valido.");
                System.out.println("\tIntente de nuevo.");
            }

        } while (size < 1 || size > 20);

        for (int k = size; k >= 1; --k)
        {
            for (int i = k; i >= 1; --i)
                System.out.printf("%3d", i);

            for (int i = 2; i <= k;  ++i)
                System.out.printf("%3d", i);

            System.out.println();
        }
    }
}
