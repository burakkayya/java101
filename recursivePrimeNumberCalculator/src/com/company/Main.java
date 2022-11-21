package com.company;

import java.util.Scanner;

public class Main {

    static void isPrime(int number, int i) {
        if (i == number) {
            System.out.print(number + " is prime.");
            return;
        } else if (number % i == 0) {
            System.out.print(number + " is not prime.");
            return;
        }

        isPrime(number, i + 1);
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        number = sc.nextInt();
        isPrime(number, 2);
    }
}
