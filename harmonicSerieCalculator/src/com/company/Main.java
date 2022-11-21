package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double result = 0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (double i=1.0; i<=num; i++){
            result += (1/i);
        }
        System.out.println("Result: " +result);
    }
}
