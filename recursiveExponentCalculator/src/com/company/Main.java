package com.company;

import java.util.Scanner;

public class Main {

    static int exponentCalc(int a, int b) {
        if (b == 0) return 1;
        else return a * exponentCalc(a, b - 1);
    }

    public static void main(String[] args) {
        int base, exponent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int a = sc.nextInt();
        System.out.print("Enter exponent : ");
        int b = sc.nextInt();
        System.out.println("Result : " + exponentCalc(a, b));
    }
}
