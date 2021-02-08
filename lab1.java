package com.company;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        sc.close(); // Saving the resource leak;
        char[] a = st.toCharArray();
        for (char var : a) {
            System.out.println(var);
        }
    }
}
