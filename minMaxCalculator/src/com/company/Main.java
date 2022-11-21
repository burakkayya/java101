package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInput, number = 1;


        List<Integer> numberList = new ArrayList<Integer>(); //
        System.out.print("How much number do you want to enter : ");
        numberOfInput = sc.nextInt();

        for (int i = 1; i <= numberOfInput; i++) {
            System.out.print(i + ". number : ");
            number = sc.nextInt();
            numberList.add(number);
        }

        Integer max = Collections.max(numberList);
        Integer min = Collections.min(numberList);
        System.out.println("Max Value : " + max);
        System.out.println("Min Value : " + min);
    }
}
