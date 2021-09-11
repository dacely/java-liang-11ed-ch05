package com.exercises;

import java.util.Scanner;

public class E38_DecimalToOctal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long decInt = input.nextInt();
        long decIntCopy = decInt > 0 ? decInt : (long)Math.pow(2, 32) + decInt;
        StringBuilder octInt = new StringBuilder();

        while (decIntCopy > 0)
        {
            octInt.insert(0, decIntCopy % 8);
            decIntCopy /= 8;
        }

        System.out.printf("%d => %s\n", decInt, octInt);
        System.out.printf("%d => %s", decInt, Integer.toOctalString((int) decInt));
    }
}
