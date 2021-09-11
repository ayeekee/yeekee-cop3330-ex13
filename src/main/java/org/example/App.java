package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        String principal = se.nextLine();
        double p = Double.parseDouble(principal);

        System.out.print("What is the rate? ");
        String rate = se.nextLine();
        double rt = Double.parseDouble(rate);

        System.out.print("What is the number of years? ");
        String numYears = se.nextLine();
        int t = Integer.parseInt(numYears);

        System.out.print("What is the number of times the interest is compounded per year? ");
        String compounded = se.nextLine();
        int n = Integer.parseInt(compounded);

        double r = rt / 100 ;

        double amount = p * (Math.pow((1 + (r / n)), (n * t)));

        System.out.println("$" + principal + " invested at " + rt + "% for " + t + " years compounded " + n + " times per year is $" + String.format("%.2f", amount) + ".");
    }
}
