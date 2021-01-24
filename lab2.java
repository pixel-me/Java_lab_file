package com.company;

import java.util.Scanner;
public class lab2
{
    public static void main(String[] args)
    {
        String str;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        str = sc.nextLine();
        sc.close();
        for (i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) < 'A' || str.charAt(i) > 'Z' && str.charAt(i) < 'a' || str.charAt(i) > 'z')
            {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        System.out.println(str);
    }
}
