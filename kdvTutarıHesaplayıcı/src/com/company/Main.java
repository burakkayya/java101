package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz : ");
        tutar = sc.nextDouble();

        kdvOran = (tutar > 1000) ? 0.08 : 0.18;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV tutarı : " + kdvTutar);
        System.out.println("KDV'li tutar : " + kdvliTutar);

    }
}
