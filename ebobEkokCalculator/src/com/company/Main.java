package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ekok = 1;
        int number1, number2;
        int ebob = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        number1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        number2 = sc.nextInt();

        int i = 1;
        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int j = 1;
        while (j <= (number1 * number2)) {
            if (j % number1 == 0 && j % number2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }

        System.out.println("Ebob of numbers : " + ebob);
        System.out.println("Ekok of numbers : " + ekok);
    }
}
