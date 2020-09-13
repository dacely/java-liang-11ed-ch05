package com.exercises;

public class E15_AsciiCode
{
    public static void main(String[] args)
    {
        for(int i = 33; i <= 126; ++i)
        {
            System.out.printf("%c ", (char) i);

            if ((i - 32) % 10 == 0)
                System.out.println();
        }
    }
}
