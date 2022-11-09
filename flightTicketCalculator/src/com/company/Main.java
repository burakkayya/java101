package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int age, tripType;
        double distance = 0.0, total = 0.0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Mesafeyi km türünden giriniz : ");
            distance = sc.nextInt();
            if (!(distance > 0)) {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } while (!(distance > 0));

        do {
            System.out.print("Yaşınızı giriniz : ");
            age = sc.nextInt();
            if (!(age > 0)) {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } while (!(age > 0));

        do {
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
            tripType = sc.nextInt();
            if (!(tripType == 1 || tripType == 2)) {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } while (!(tripType == 1 || tripType == 2));

        if (age < 12) {
            total = (distance * 0.10) - ((distance * 0.10) * (0.50));
        } else if (age >= 12 && age < 24) {
            total = (distance * 0.10) - ((distance * 0.10) * (0.10));
        } else if (age > 65) {
            total = (distance * 0.10) - ((distance * 0.10) * (0.30));
        } else {
            total = (distance * 0.10);
        }

        if (tripType == 2) {
            total = (total - (total * 0.20)) * 2;
        }

        System.out.println("Toplam Tutar = " + total + " TL");
    }
}
