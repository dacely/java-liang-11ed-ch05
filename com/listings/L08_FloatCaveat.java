package com.listings;

public class L08_FloatCaveat
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        for (double i = 0.0; i < 1.0; i += 0.01)
        {
            System.out.println(i);
            sum += i;
        }
        System.out.print(sum);
    }
}
