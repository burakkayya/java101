package com.company;

public class Main {

    static boolean isPalindrom(int number) {

        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }

        if (number == reverseNumber) {
            System.out.println(number+" is palindrom.");
            return true;
        } else {
            System.out.println(number +" is not palindrom.");
            return false;
        }

    }
    public static void main(String[] args) {
        isPalindrom(559226);
        isPalindrom(123321);
    }
}
