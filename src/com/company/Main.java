package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        //Display this on the screen:
        System.out.println("Welcome to We'll Fartgo!");
        System.out.println("Please type in your name.");
        //This program will now stop to allow the user to give input.
        Scanner input = new Scanner(System.in);
        //This "input" is assigned to a string type:
        String name = input.nextLine();
        //If name = this... then that; else that:
        if (name.equals("")) {
            throw new Exception("Sorry you must enter a Name");
        }
        else if (name.trim().equals("")) {
            throw new Exception("Sorry you must enter a Name");
        }
        //If name is parameters are valid, print this:
        System.out.println("Welcome, " + name);
        //Then say, "What would you like to do:"
        System.out.println("What would you like to do:");
        System.out.println("1) Check my balance 2) Withdraw funds 3) Cancel");
        System.out.println("Please a select number: 1, 2, or 3) and press return.");
        //The "input" is now assigned to a string type:
        String choice = input.nextLine();
        //Specify 1, 2, or 3 IF statements here:
        if (choice.contains("1")) {
            System.out.print("You have $100");
            }
        else if (choice.contains("2")) {
            System.out.println("How much money would you like to withdraw?");
            String withdrawenAmt = input.nextLine();
            System.out.println("Here is your $" + withdrawenAmt + " money.");
        }
        else if (choice.contains("3")) {
            System.out.println("Thank you and please come again.");
            }
        else {
            throw new Exception("Invalid option.");
            }
        }
    }
