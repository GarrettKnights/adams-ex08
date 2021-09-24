
/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise08;

import java.util.*;

public class Solution08 {
    public static void main(String[] args) {

        Scanner ScanWord = new Scanner(System.in);

        int peeps;
        int pizzanum;
        int slices;
        int AllSlices;

        //Asks user for input
        System.out.print("How many people? ");
        //Scans peeps input
        peeps = ScanWord.nextInt();
        //Asks user for input
        System.out.print("How many pizzas do you have? ");
        //Scans pizzanum input
        pizzanum = ScanWord.nextInt();
        //Asks user for input
        System.out.print("How many slices per pizza? ");
        //Scans slices input
        slices = ScanWord.nextInt();
        //Calculates the total number of slices

        AllSlices = slices * pizzanum;
        //Prints out final output

        System.out.println(peeps + " people with " + pizzanum + " pizzas (" + AllSlices + " slices)");

        System.out.println("Each person gets " + AllSlices / peeps + " pieces of pizza.");

        System.out.println("There are " + (AllSlices % peeps) + " leftover pieces.");
    }

}
