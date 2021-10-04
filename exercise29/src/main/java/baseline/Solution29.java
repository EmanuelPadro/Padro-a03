package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Emanuel_Padro
 */


public class Solution29 {
    public static double Input(){
        Scanner input = new Scanner(System.in);
        //settin rate of return
        double r = 72;
        //this boolean value will be used to test validity of input
        boolean valid;
        do {
            // at the beggining of each loop set both of these as true unless proven false in error cehckers bellow
            boolean doublecheck = true;
            valid = true;
            System.out.println("What is the rate of return");
            String userinput = input.nextLine();

            try {
                Double.parseDouble(userinput);
            } catch (NumberFormatException e) {
                doublecheck = false;
            }

            if (doublecheck) {
                r = Double.parseDouble(userinput);
                if (r == 0) {
                    valid = false;
                }
            }else{
                valid = false;
            }

            if (!valid) {
                System.out.println("Sorry. That's not valid input");
            }
        }while(!valid);
        return 72/r; //finnaly return value if it gets trough all these checks
    }

    public static void main(String[] args) {

        double years = Solution29.Input();
        System.out.print(years);

    }
}