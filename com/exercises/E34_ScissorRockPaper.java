package com.exercises;

import java.util.Scanner;

public class E34_ScissorRockPaper
{
    public static String[] choices = {"Scissor", "Rock", "Paper"};
    public static int userWins = 0;
    public static int computerWins = 0;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("Scissor(0), Rock(1), Paper(2): ");
            updateWins(input.nextInt(), computerThrows());
            System.out.printf("Computer %d | You %d\n\n", computerWins, userWins);
        } while (Math.abs(userWins - computerWins) < 2);
    }

    public static int computerThrows()
    {
        int computersChoice = (int) (Math.random() * 3);
        System.out.printf("Computer throws %s", choices[computersChoice]);
        return computersChoice;
    }

    public static void updateWins(int user, int computer)
    {
        System.out.print(": ");
        switch (user)
        {
            case 0:
                switch (computer)
                {
                    case 0:
                        System.out.println("It's a draw");
                        break;
                    case 1:
                        System.out.println("You lose");
                        computerWins++;
                        break;
                    case 2:
                        System.out.println("You won");
                        userWins++;
                        break;
                }
                break;
            case 1:
                switch (computer)
                {
                    case 0:
                        System.out.println("You won");
                        userWins++;
                        break;
                    case 1:
                        System.out.println("It's a draw");
                        break;
                    case 2:
                        System.out.println("You lose");
                        computerWins++;
                        break;
                }
                break;
            case 2:
                switch (computer)
                {
                    case 0:
                        System.out.println("You lose");
                        computerWins++;
                        break;
                    case 1:
                        System.out.println("You won");
                        userWins++;
                        break;
                    case 2:
                        System.out.println("It's a draw");
                        break;
                }
        }
    }
}
