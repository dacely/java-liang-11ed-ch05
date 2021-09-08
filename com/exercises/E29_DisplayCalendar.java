package com.exercises;

import java.util.Scanner;

public class E29_DisplayCalendar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (e.g., 2012): ");
        int y = input.nextInt();

        // h = Day of Week for January 1st using Zeller's Algorithm
        int j = (y - 1) / 100;
        int k = (y - 1) % 100;
        int h = (37 + k + k / 4 + j / 4 + 5 * j) % 7;
        h = (h + 6) % 7;  // Offset Sunday = 0

        String[] monthNames = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        int[] numOfDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
            ++numOfDaysInMonth[1];

        System.out.println();
        for (int i = 0; i < 12; i++)
        {
            printMonth(numOfDaysInMonth[i], h, monthNames[i], y);
            h = (h + numOfDaysInMonth[i]) % 7;
        }
    }

    public static void printMonth(int numberOfDays, int startDay, String monthName, int year)
    {
        String title = monthName + " " + year;
        int titlePad = (35 - title.length()) / 2;

        for (int i = 0; i < titlePad; i++)
            System.out.print(" ");

        System.out.println(title);
        System.out.println("===================================");
        System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");

        for (int i = 0; i < startDay; i++)
            System.out.print("     ");

        int newLineCount = startDay;

        for (int i = 1; i <= numberOfDays; i++)
        {
            System.out.printf(" %3d ", i);
            newLineCount++;

            if (newLineCount % 7 == 0)
                System.out.println();
        }

        if (newLineCount % 7 == 0)
            System.out.println();
        else
            System.out.println("\n");
    }
}
