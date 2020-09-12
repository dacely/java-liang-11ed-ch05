package com.listings;

import java.util.Scanner;

public class L11_DecToHex
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numbero entero: ");
        int numDec = input.nextInt();
        StringBuilder builder = new StringBuilder();

        while (numDec > 0)
        {
            switch (numDec % 16)
            {
                case 10:
                    builder.insert(0, "A");
                    break;
                case 11:
                    builder.insert(0, "B");
                    break;
                case 12:
                    builder.insert(0, "C");
                    break;
                case 13:
                    builder.insert(0, "D");
                    break;
                case 14:
                    builder.insert(0, "E");
                    break;
                case 15:
                    builder.insert(0, "F");
                    break;
                default:
                    builder.insert(0, (numDec % 16) + "");
                    break;
            }

            numDec /= 16;
        }

        System.out.printf("%d en hexadecimal es %s", numDec, builder.toString());
    }
}
