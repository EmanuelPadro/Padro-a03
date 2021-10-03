package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Emanuel_Padro
 */


import java.util.Scanner;

//This program will either in one or two classes check 2 words to see if they are an anagram
//it will get input from user then send that input to be solved using isAnagram and then output an out statement
public class Solution24 {

    public static void getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String input1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String input2 = scanner.nextLine();

        new Solver24(input1, input2);

    }

    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        getInput();// The "y" for output indicates if user wants output, to future proof and practice



    }
}
