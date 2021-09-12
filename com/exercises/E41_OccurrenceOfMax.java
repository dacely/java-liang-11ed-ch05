package com.exercises;

import java.util.Scanner;

public class E41_OccurrenceOfMax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = input.nextInt();
        int max = num;
        int maxCount = 1;

        if (num == 0)
            System.out.println("No numbers are entered except 0");
        else
        {
            num = input.nextInt();

            while (num != 0)
            {
                if (num > max)
                {
                    max = num;
                    maxCount = 1;
                }
                else if (num == max)
                {
                    ++maxCount;
                }

                num = input.nextInt();
            }
        }

        System.out.printf("The largest number is %d\n", max);
        System.out.printf("The occurrence count of the largest number is %d\n", maxCount);
    }
}
