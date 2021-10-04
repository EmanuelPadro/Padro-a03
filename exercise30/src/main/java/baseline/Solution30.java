package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Emanuel_Padro
 */


//Will set the parameters I believe using regex or another text formatting function so that it prints table
//will use a loop to do so( if it is too much for one
// method then will create a second method that prepares the setup of the table and another that prints it
public class Solution30 {
    public static void MultiplicationTable() {
        for (int i = 1; i <= 12; i++) {// for loop prints 12 nums and  prints them vertically
            for (int j = 1; j <= 12; j++) {

                //These statemets take care of some spacing issues
                if (i * j >= 100) {
                    System.out.print(" " + i * j);
                } else if (i * j >= 10) {
                    System.out.print("  " + i * j);
                } else if (i * j < 10) {
                    System.out.print("   " + i * j);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        MultiplicationTable();
    }
}