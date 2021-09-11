package com.exercises;

import java.util.Scanner;

public class E37_DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long decInt = input.nextInt();
        long decIntCopy = decInt > 0 ? decInt : (long)Math.pow(2, 32) + decInt;
        StringBuilder binInt = new StringBuilder();

        while (decIntCopy > 0)
        {
            binInt.insert(0, decIntCopy % 2);
            decIntCopy /= 2;
        }

        System.out.printf("%d => %s\n", decInt, binInt);
        System.out.printf("%d => %s", decInt, Integer.toBinaryString((int)decInt));
    }
}
