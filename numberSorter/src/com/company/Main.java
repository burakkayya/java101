package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        number1 = sc.nextInt();
        System.out.print("Enter second number : ");
        number2 = sc.nextInt();
        System.out.print("Enter third number : ");
        number3 = sc.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println(number1);
            if (number2 < number3) {
                System.out.println(number2);
                System.out.println(number3);
            } else {
                System.out.println(number3);
                System.out.println(number2);
            }
        } else if (number2 < number1 && number2 < number3) {
            System.out.println(number2);
            if (number1 < number3) {
                System.out.println(number1);
                System.out.println(number3);
            } else {
                System.out.println(number3);
                System.out.println(number1);
            }
        } else {
            System.out.println(number3);
            if (number1 < number2) {
                System.out.println(number1);
                System.out.println(number2);
            } else {
                System.out.println(number2);
                System.out.println(number1);
            }
        }

    }
}
