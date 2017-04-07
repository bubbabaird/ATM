package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        HashMap<String, Double> accounts = new HashMap<>();

        //Display this on the screen:
        System.out.println("Welcome to We'll Fartgo!");


        while (true) {
            System.out.println("Please type in your name.");

            //This "input" is assigned to a string type:
            //This program will now stop to allow the user to give input.
            String name = input.nextLine();

            // see if name is in the hashmap.
            // (is accounts.get(name) null?)
            // if it's not, add it to the accounts hash map with a default balance of 100.00.
            // e.g. accounts.put(name, 100.00);

            //If name = this... then that; else that:
            if (name.trim().equals("")) {
                throw new Exception("Sorry you must enter a Name");
            }

            // If name is parameters are valid, print this:
            System.out.println("Welcome, " + name);

            while (true) {
                //Then say, "What would you like to do:"
                System.out.println("What would you like to do:");
                System.out.println("1) Check my balance 2) Withdraw funds 3) Cancel");
                System.out.println("Please a select number: (1, 2, or 3) and press return.");

                // The "input" is now assigned to a string type:
                String choice = input.nextLine();

                // Specify 1, 2, or 3 IF statements here:
                if (choice.equals("1")) {
                    System.out.println("You have $" + 100.00);
                } else if (choice.equals("2")) {
                    // update the hashmap at "name" with a new balance
                    // but only do this if the amount they ask for is
                    // less than the amount they have
                    // accounts.put(name, new balance whatever that is);
                    System.out.println("How much money would you like to withdraw?");

                    String withdrawenAmt = input.nextLine();
                    System.out.println("Here is your $" + withdrawenAmt + " money.");
                } else if (choice.equals("3")) {
                    System.out.println("Thank you and please come again.");
                    break;
                } else {
                    throw new Exception("Invalid option.");
                }
            }
        }
    }
}
