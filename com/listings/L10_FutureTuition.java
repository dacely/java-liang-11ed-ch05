package com.listings;

public class L10_FutureTuition
{
    public static void main(String[] args)
    {
        double tuition = 10_000;
        int year = 0;

        while (tuition < 20_000)
        {
            year++;
            tuition *= 1.07;
        }

        System.out.printf("The tuition will be doubled in %d years \n", year);
        System.out.printf("The tuition will be %.2f in %d years\n", tuition, year);
        System.out.println(Math.ceil(Math.log(2) / Math.log(1.07)));
    }
}
