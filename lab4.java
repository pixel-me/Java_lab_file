package com.company;
import java.util.Scanner;
public class lab4 {
    public static void main(String[] args)
    {
        String str;
        StringBuilder rev = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:");
        str = sc.nextLine();
        sc.close();
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- )
            rev.append(str.charAt(i));
        if (str.equals(rev.toString()))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");

    }
}
