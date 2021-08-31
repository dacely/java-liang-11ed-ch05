package com.exercises;

public class E20_PrimeNumbers
{
    public static void main(String[] args)
    {
        // Find the fist N prime numbers

        final int N = 1000;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int primesCounter = 0;
        int num = 1;

        while (primesCounter < N)
        {
            if (isPrime(num))
            {
                System.out.printf("%8d", num);
                primesCounter += 1;
                if (primesCounter % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.println();
            }
            num += 1;
        }
    }

    public static boolean isPrime(int n)
    {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        int sqrtN = (int) Math.sqrt(n) + 1;

        for (int i = 6; i <= sqrtN; i += 6)
        {
            if (n % (i - 1) == 0 || n % (i + 1) == 0)
                return false;
        }

        return true;
    }
}
