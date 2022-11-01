package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;
        double u, alan;

        Scanner sc = new Scanner(System.in);

        System.out.print("1. Kenarın uzunlugunu giriniz : ");
        a = sc.nextInt();
        System.out.print("2. Kenarın uzunlugunu giriniz : ");
        b = sc.nextInt();
        System.out.print("3. Kenarın uzunlugunu giriniz : ");
        c = sc.nextInt();

        u = (a + b + c) / 2;
        System.out.println("Üçgenin Alanı : " + Math.sqrt((u * (u - a) * (u - b) * (u - c))));
    }
}
