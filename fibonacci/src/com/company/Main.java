package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int value, n1 = 0, n2 = 1, t = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of element : ");
        value = sc.nextInt();



        for (int i = 2; i < value; i++) {
            t = n1 + n2;
            System.out.println(n1+" + "+n2+" = "+t);
            n1 = n2;
            n2 = t;

        }
    }
}
