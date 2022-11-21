package com.company;

import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner sc = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = sc.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = sc.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner sc = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = sc.nextInt();

            if (number == 1) break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = sc.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = sc.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = sc.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int a = sc.nextInt();
        System.out.print("Sayı giriniz :");
        int b = sc.nextInt();
        int result =1;
        result = a%b;
        System.out.println("Sonuç: "+result);
    }
    static void rectangular(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int a = sc.nextInt();
        System.out.print("Sayı giriniz :");
        int b = sc.nextInt();
        int area, perimeter;
        perimeter=2*(a+b);
        System.out.println("Dikdörtgenin çevresi: " + perimeter);
        area=a*b;
        System.out.println("Dikdörtgenin alanı: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        String menu =
                "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
