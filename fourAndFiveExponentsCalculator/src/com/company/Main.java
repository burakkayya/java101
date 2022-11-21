package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number=sc.nextInt();

        System.out.print("Four exponents until "+number+" : ");
        for (int i=1; i<=number; i*=4){
            System.out.print(i + "   ");
        }

        System.out.println();
        
        System.out.print("Five exponents until "+number+" : ");
        for (int i=1; i<=number; i*=5){
            System.out.print(i + "   ");
        }
    }
}
