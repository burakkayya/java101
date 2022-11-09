package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        // create a Scanner to get inputs
        Scanner sc = new Scanner(System.in);

        // get a input(operator) from user
        System.out.print("Enter an operator(+, -, *, /) : ");
        operator = sc.next().charAt(0);

        // get a first number from user
        System.out.print("Enter first number : ");
        number1 = sc.nextDouble();

        // get a second number from user
        System.out.print("Enter second number : ");
        number2 = sc.nextDouble();

        switch (operator) {

            // addition
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // subtraction
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // multiplication
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // division
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            // if input's(operator) format is not correct throw exception
            default:
                System.out.println("Invalid operator!");
                break;
        }

        //sc.close();
    }
}
