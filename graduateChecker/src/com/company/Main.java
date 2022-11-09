package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mathMark, physicsMark, chemistryMark, turkishMark, musicMark, lectureNumber = 0;
        double avg = 0.0, total = 0.0;

        System.out.print("Enter math's mark : ");
        mathMark = sc.nextInt();
        if (mathMark <= 100 && mathMark >= 0) {
            total += mathMark;
            lectureNumber++;
        }

        System.out.print("Enter physics's mark : ");
        physicsMark = sc.nextInt();
        if (physicsMark <= 100 && physicsMark >= 0) {
            total += physicsMark;
            lectureNumber++;
        }

        System.out.print("Enter chemistry's mark : ");
        chemistryMark = sc.nextInt();
        if (chemistryMark <= 100 && chemistryMark >= 0) {
            total += chemistryMark;
            lectureNumber++;
        }

        System.out.print("Enter turkish's mark : ");
        turkishMark = sc.nextInt();
        if (turkishMark <= 100 && turkishMark >= 0) {
            total += turkishMark;
            lectureNumber++;
        }

        System.out.print("Enter music's mark : ");
        musicMark = sc.nextInt();
        if (musicMark <= 100 && musicMark >= 0) {
            total += musicMark;
            lectureNumber++;
        }

        avg = total / lectureNumber;
        System.out.println(avg >= 55 ? "You passed the class! " : "You failed the class! ");
        System.out.println("Your average : " + avg);

    }
}
