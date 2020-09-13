package com.exercises;

public class E12_FindSmallest
{
    public static void main(String[] args)
    {
        int n = 2;
        while (Math.pow(n, 3) < 12_000)
            ++n;
        System.out.println(n);
    }
}
