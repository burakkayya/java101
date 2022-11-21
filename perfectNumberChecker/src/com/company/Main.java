package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, sum=0;
        try(var input = new Scanner(System.in)){
            System.out.println("Enter a number : ");
            number = input.nextInt();
        }
        for(int i = 1; i < number; i++){
            if(number%i == 0){
                sum += i;
            }
        }
        if(sum == number)
            System.out.println(number + " is perfect number.");
        else
            System.out.println(number + " is not perfect number.");
    }
}
