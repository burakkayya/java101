package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int kilo;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        double total = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo = :");
        kilo = sc.nextInt();
        total += armutFiyat * kilo;

        System.out.print("Elma Kaç Kilo = :");
        kilo = sc.nextInt();
        total += elmaFiyat * kilo;

        System.out.print("Domates Kaç Kilo = :");
        kilo = sc.nextInt();
        total += domatesFiyat * kilo;

        System.out.print("Muz Kaç Kilo = :");
        kilo = sc.nextInt();
        total += muzFiyat * kilo;

        System.out.print("Patlıcan Kaç Kilo = :");
        kilo = sc.nextInt();
        total += patlicanFiyat * kilo;

        System.out.println("Toplam Tutar : " + total);


    }
}
