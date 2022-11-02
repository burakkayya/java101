package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double boy, kilo, vucutKitleIndeksi;

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = sc.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = sc.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi);
    }
}
