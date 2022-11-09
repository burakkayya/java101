package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, day;
        String horoscope = "";
        do {
            System.out.print("Enter the month that you borned : ");
            month = sc.nextInt();
        }
        while (month < 1 || month > 12);

        do {
            System.out.print("Enter the day that you borned : ");
            day = sc.nextInt();
        }
        while (day < 1 || day > 31);

        if (month == 1) {
            if (day <= 19) {
                horoscope = "Capricorn";
            }
            if (day > 19) {
                horoscope = "Aquarius";
            }
        }
        if (month == 2) {
            if (day <= 18) {
                horoscope = "Aquarius";
            }
            if (day > 18) {
                horoscope = "Pisces";
            }
        }
        if (month == 3) {
            if (day <= 19) {
                horoscope = "Pisces";
            }
            if (day > 19) {
                horoscope = "Aries";
            }
        }
        if (month == 4) {
            if (day <= 19) {
                horoscope = "Aries";
            }
            if (day > 19) {
                horoscope = "Taurus";
            }
        }
        if (month == 5) {
            if (day <= 20) {
                horoscope = "Taurus";
            }
            if (day > 20) {
                horoscope = "Gemini";
            }
        }
        if (month == 6) {
            if (day <= 21) {
                horoscope = "Gemini";
            }
            if (day > 21) {
                horoscope = "Cancer";
            }
        }
        if (month == 7) {
            if (day <= 22) {
                horoscope = "Cancer";
            }
            if (day > 22) {
                horoscope = "Leo";
            }
        }
        if (month == 8) {
            if (day <= 22) {
                horoscope = "Leo";
            }
            if (day > 22) {
                horoscope = "Virgo";
            }
        }
        if (month == 9) {
            if (day <= 22) {
                horoscope = "Virgo";
            }
            if (day > 22) {
                horoscope = "Libra";
            }
        }
        if (month == 10) {
            if (day <= 22) {
                horoscope = "Libra";
            }
            if (day > 22) {
                horoscope = "Scorpio";
            }
        }
        if (month == 11) {
            if (day <= 21) {
                horoscope = "Scorpio";
            }
            if (day > 21) {
                horoscope = "Sagittarius";
            }
        }
        if (month == 12) {
            if (day <= 21) {
                horoscope = "Sagittarius";
            }
            if (day > 21) {
                horoscope = "Capricorn";
            }
        }
        System.out.println("Your horoscope : " + horoscope);
    }
}
