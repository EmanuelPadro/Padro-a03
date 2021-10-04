package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Emanuel_Padro
 */


public class Solution36 {
    //handles all input
    static void Input(){
        Scanner scanner = new Scanner(System.in);
        String Input;

        do{
            System.out.print("Enter a number: ");
            Input = scanner.next();
            if(!Input.equals("done")) {
                Statistics.ResponseTimes.add(Double.parseDouble(Input));
            }
        }while(!Input.equals("done"));
    }
    //prints everything
    static void Printer(){
        System.out.print("Numbers: ");
        for(int i =0; i < Statistics.ResponseTimes.size();i++){
            System.out.print(Statistics.ResponseTimes.get(i) + ",");
        }
        System.out.println("\nThe average is " + Statistics.average());
        System.out.println("The minimum is " + Statistics.minimum());
        System.out.println("The maximum is " + Statistics.max());
        System.out.println("The standard deviation is " + Statistics.Std());
    }

    public static void main(String[] args) {
        Input();
        Printer();
    }
}
