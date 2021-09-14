/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // prompt & record values
        System.out.print("Enter a 1 if you are male or 2 if you are female: ");
        int gender = input.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        int total = input.nextInt();
        System.out.print("What is your weight, in pounds? ");
        int weight = input.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        int hours = input.nextInt();

        // init ratio variable
        float ratio;

        // declare ratio
        if (gender == 1)
            ratio = (float)0.73;
        else
            ratio = (float)0.66;

        // calculate BAC
        double calculated_bac = (total * 5.14 / weight * ratio) - (.015 * hours);

        // output BAC
        System.out.println("\nYour BAC is " + String.format("%.6f", calculated_bac));

        if (calculated_bac < 0.08)
            System.out.print("It is legal for you to drive.");
        else
            System.out.print("It is not legal for you to drive.");
    }
}
