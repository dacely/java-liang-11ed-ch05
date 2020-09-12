package com.listings;

import java.util.Scanner;

public class L14_Palindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String str1 = input.nextLine();
        int n = str1.length();
        int i = 0;
        boolean isPalindrome = true;

        while (i <= n - 1 - i)
        {
            if (str1.charAt(i) != str1.charAt(n - 1 - i))
            {
                isPalindrome = false;
                break;
            }

            i++;
        }

        if (isPalindrome)
            System.out.println("La palabra ingresada es un palindrome");
        else
            System.out.println("La palabra ingresada NO es un palindrome");
    }
}
