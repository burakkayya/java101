package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = sc.nextInt();

        for (int i = 1;  i <= number; i++)    {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
