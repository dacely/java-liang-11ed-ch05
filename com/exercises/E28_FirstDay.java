package com.exercises;

import java.util.Scanner;

public class E28_FirstDay
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year (1 = Monday): ");
        int dayNumber = input.nextInt() - 1;

        String[] dayNames = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};
        String[] monthNames = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        monthDays[1] = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;

        for (int i = 0; i < 12; i++)
        {
            System.out.printf("%s 1, %d is %s\n", monthNames[i], year, dayNames[dayNumber]);
            dayNumber = (dayNumber + monthDays[i]) % 7;
        }
    }
}
