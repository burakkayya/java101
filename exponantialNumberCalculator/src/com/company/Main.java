package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number,exponent,total = 1;

        System.out.print("Enter a number : ");
        number  = sc.nextInt();
        System.out.print("Enter a exponent : ");
        exponent = sc.nextInt();

        for(int i = 1; i<=exponent; i++){
            total = total*number;
        }

        System.out.print("Result : "+total);
    }
}
