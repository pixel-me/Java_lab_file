package com.company;

import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        sc.close();
        try {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                  throw new MyException("not the prime number");
                }
            }
            System.out.println("Prime number.");
        }
        catch (MyException exp) {
            if (null == exp.getMessage()) {
                exp.printStackTrace();
            }
        }
    }

}
