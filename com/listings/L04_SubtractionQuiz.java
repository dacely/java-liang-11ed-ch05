package com.listings;

import java.util.Scanner;

public class L04_SubtractionQuiz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder report = new StringBuilder();
        String reportLine;

        final int NUMBER_OF_QUESTIONS = 5;
        int n1, n2, temp, ans;

        int count = 0;
        int correctCounter = 0;
        long startTime = System.currentTimeMillis();

        while (count < 5)
        {
            n1 = (int) (Math.random() * 10);
            n2 = (int) (Math.random() * 10);

            if (n1 > n2)
            {
                temp = n1;
                n1 = n2;
                n2 = temp;
            }

            System.out.printf("¿Cuanto es %d menos %d? ", n2, n1);
            ans = input.nextInt();

            if (ans == n2 - n1)
            {
                System.out.println("Correcto");
                ++correctCounter;
                reportLine = String.format("\t%d - %d = %d \tCorrecto\n", n2, n1, n2 - n1);
            }
            else
            {
                System.out.printf("Error: %d menos %d es %d\n", n2, n1, n2 - n1);
                reportLine = String.format("\t%d - %d = %d \tError\n", n2, n1, n2 - n1);
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
