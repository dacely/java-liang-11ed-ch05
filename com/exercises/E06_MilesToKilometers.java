package com.exercises;

public class E06_MilesToKilometers
{
    public static void main(String[] args)
    {
        System.out.println(" Miles \u250a Kilometers \u2551 Kilometers \u250a Miles ");
        final double MI_TO_KM_RATIO = 1.609344;

        for (int miles = 1; miles <= 10; miles++)
        {
            double miInKm = miles * MI_TO_KM_RATIO;
            int kilometers = 5 * miles + 15;
            double kmInMi = kilometers * (1 / MI_TO_KM_RATIO);

            System.out.printf("%5d  \u250a%10.3f  \u2551%5d  \u250a%10.3f  \n",
                    miles,  miInKm, kilometers, kmInMi);
        }
    }
}
