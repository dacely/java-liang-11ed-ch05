package com.exercises;

public class E13_FindLargest
{
    public static void main(String[] args)
    {
        int n = 2;
        while (Math.pow(n, 2) < 12_000)
            ++n;
        System.out.println(n - 1);
    }
}
