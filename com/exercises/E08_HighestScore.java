package com.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class E08_HighestScore
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of students: ");
        int numStu = input.nextInt();
        double[] scores = new double[numStu];
        String[] names = new String[numStu];

        for (int i = 0; i < numStu; i++)
        {
            System.out.print("Enter the name and score of student " + (i + 1) + " (e.g. David 4.5): ");
            names[i] = input.next();
            scores[i] = input.nextDouble();
        }

        int i_1_max = 0;

        for (int i = 1; i < numStu; i++)
        {
            if (scores[i] > scores[i_1_max])
                i_1_max = i;
        }

        System.out.printf("%s has the highest score", names[i_1_max]);
    }
}
