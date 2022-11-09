package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int temputare;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temputare : ");
        temputare = sc.nextInt();
        
        if(temputare<5) System.out.println("You can go to ski");
        else if(temputare>=5 && temputare<15) System.out.println("You can go to cinema");
        else if(temputare>=15 && temputare<25) System.out.println("You can go to picnic");
        else if(temputare>=25) System.out.println("You can go to swimming");

    }
}
