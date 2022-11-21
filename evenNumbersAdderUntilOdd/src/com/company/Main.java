package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,total = 0;

        do {
            System.out.println("Enter a number : ");
            i = sc.nextInt();

            if (i % 2 == 0 && i % 4 == 0) {
                total += i;
            }

        } while (i % 2 == 0);
        System.out.println("Total : " + total);
    }
}
