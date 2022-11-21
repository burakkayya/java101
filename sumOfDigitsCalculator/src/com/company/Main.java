package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int basNumber = 0;
        int total = 0;
        int digit =0;
        int temp = number;

        while(number != 0){
            digit = number%10;
            number/=10;
            total += digit;
        }

        System.out.println(temp+"'s sum of digits : "+total);
    }
}
