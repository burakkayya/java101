package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int r, angle;
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = sc.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        angle = sc.nextInt();

        double alan = (pi * (r * r) * angle) / 360;

        System.out.println("Daire diliminin alanı : " + alan);
    }
}
