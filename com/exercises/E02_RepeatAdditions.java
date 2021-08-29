package com.exercises;

import java.util.Scanner;

public class E02_RepeatAdditions
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder report = new StringBuilder();
        String reportLine;

        final int NUMBER_OF_QUESTIONS = 10;
        int n1, n2, temp, ans;

        int count = 0;
        int correctCounter = 0;
        long startTime = System.currentTimeMillis();

        while (count < NUMBER_OF_QUESTIONS)
        {
            n1 = (int) (Math.random() * 16);
            n2 = (int) (Math.random() * 16);

            System.out.printf("¿Cuánto es %d más %d? ", n2, n1);
            ans = input.nextInt();

            if (ans == n2 + n1)
            {
                System.out.println("Correcto");
                ++correctCounter;
                reportLine = String.format("\t%2d + %2d = %2d \tCorrecto\n", n2, n1, n2 + n1);
            }
            else
            {
                System.out.printf("Error: %d más %d es %d\n", n2, n1, n2 + n1);
                reportLine = String.format("\t%2d + %2d = %2d \tError\n", n2, n1, ans);
            }

            report.append(reportLine);
            ++count;
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;
        System.out.printf("\n\nReporte:\n%s", report);
        System.out.printf("%1$d respuesta%2$s correcta%2$s\n", correctCounter, correctCounter > 1 ? "s": "");
        System.out.printf("Tardo en la prueba %d segundos", totalTime);
    }
}
