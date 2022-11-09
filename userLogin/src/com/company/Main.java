package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String username = "user", password = "12345";
        String inputUsername, inputPassword, inputNewPassword;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter username : ");
            inputUsername = sc.next();
            System.out.print("Enter password : ");
            inputPassword = sc.next();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("You entered !");
                break;
            } else {
                System.out.println("User informations are wrong !");
                System.out.print("Do you want to change your password ? (yes/no) : ");

                if (sc.next().equals("yes")) {
                    while (true) {
                        System.out.println("Enter a new password : ");
                        inputNewPassword = sc.next();
                        if (!inputNewPassword.equals(password) && !inputNewPassword.equals(inputPassword)) {
                            password = inputNewPassword;
                            System.out.println("Your new password is created !");
                            break;
                        } else {
                            System.out.println("Your new password is not created, try again !");
                        }
                    }
                }
            }
        }
    }
}
