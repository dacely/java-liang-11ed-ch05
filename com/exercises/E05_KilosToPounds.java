package com.exercises;

public class E05_KilosToPounds
{
    public static void main(String[] args)
    {
        System.out.println("Kilograms \u250a  Pounds   \u2551   Pounds \u250a Kilograms");
        final double KILO_TO_POUND_RATIO = 2.20462262185;

        for (int kilos = 1; kilos <= 199; kilos += 2)
        {
            double kgToPounds = kilos * KILO_TO_POUND_RATIO;
            int pounds = 5 * ((kilos + 1) / 2) + 15;
            double lbToKilos = pounds * (1 / KILO_TO_POUND_RATIO);

            System.out.printf("%8d  \u250a%7.1f    \u2551%8d  \u250a%9.2f \n",
                    kilos,  kgToPounds, pounds, lbToKilos);
        }
    }
}
