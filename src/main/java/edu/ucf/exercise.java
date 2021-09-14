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

        // prompt for age
        System.out.print("What is your age? ");
        int age = input.nextInt();

        // output result
        System.out.print(age > 15 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}
