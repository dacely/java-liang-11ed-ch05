package com.exercises;

import java.util.Random;

public class E40_HeadsOrTails
{
    public static void main(String[] args)
    {
        Random rand = new Random(System.currentTimeMillis());
        int coin;
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1_000_000; i++)
        {
            coin = rand.nextInt(2);
            if (coin == 0)
                ++heads;
            else
                ++tails;
        }
        System.out.printf("Heads: %7d\n", heads);
        System.out.printf("Tails: %7d\n", tails);
    }
}
