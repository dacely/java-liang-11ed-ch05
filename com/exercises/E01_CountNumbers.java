package com.exercises;

import java.util.Scanner;

public class E01_CountNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int countNeg = 0;
        int countPos = 0;
        int sum = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        do
        {
            n = input.nextInt();
            if (n == 0)
                break;
            else
            {
                if (n > 0)
                    countPos++;
                else
                    countNeg++;

                sum += n;
            }

        } while (true);

        int count = countNeg + countPos;

        if (count > 0)
        {
            System.out.printf("The number of positives is %d\n", countPos);
            System.out.printf("The number of negatives is %d\n", countNeg);
            System.out.printf("The total is %d\n", sum);
            System.out.printf("The average is %.2f\n", (double) sum / count);
        }
        else
        {
            System.out.println("No numbers are entered except 0");
        }
    }
}
