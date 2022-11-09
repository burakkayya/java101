package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}
