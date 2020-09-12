package com.listings;

public class L15_PrimeNumbers
{
    public static void main(String[] args)
    {
        final int NUMBER_OF_PRIMES = 1000;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        System.out.printf("%8d", 2);
        int primesCounter = 1;
        int n = 3;

        while (primesCounter < NUMBER_OF_PRIMES)
        {
            boolean isPrime = true;

            for (int i = 2; i <= (int) Math.ceil(Math.sqrt(n)); i++)
            {
                if (n % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.printf("%8d", n);
                primesCounter += 1;
                if (primesCounter % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.println();
            }

            n += 1;
        }
    }
}
