package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userName, password;
        int counter = 3;
        int select;
        int amount;
        int total = 3000;

        while (4 > counter && counter > 0) { // counter'a verdiğimiz 3 limitiyle beraber döngüyü çalıştıracak!
            System.out.print("Enter user name : ");
            userName = sc.nextLine();
            System.out.print("Enter password : ");
            password = sc.nextLine();

            if (userName.equals("patika") && password.equals("123")) {
                System.out.println();
                do {
                    System.out.println();
                    System.out.print("Select a operation : ");
                    System.out.println();
                    System.out.println("1- Deposit Money \n" + "2- Withdraw Money \n" + "3- Balance Inquiry\n" + "4- Exit");
                    select = sc.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Amount : ");
                            amount = sc.nextInt();
                            total += amount;
                            System.out.println("Done!");
                            continue;

                        case 2:
                            System.out.print("Amount : ");
                            amount = sc.nextInt();
                            if (total > amount || total == amount) {
                                System.out.println("Done!");
                                total -= amount;

                            } else {
                                System.out.println("You don't have enough money!");

                            }
                            continue;

                        case 3:
                            System.out.print("Your Balance : " + total);
                            continue;

                        case 4:
                            System.out.println("You are exited!");
                            return;
                    }
                } while (true);

            }
            counter--;
            System.out.println("Incorrect Entry. Try Again!");
            System.out.println("You have "+counter +" left!");
            if (counter == 0) {
                System.out.println("Your account has been blocked.");
            }

        }
    }
}
