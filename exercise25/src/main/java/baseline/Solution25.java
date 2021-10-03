package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Emanuel_Padro
 */

//needs to check if less than or more than 8 char

//needs to check if only letters and only numbers

//needs to check if one number and 8 chars

//needs to check that if contains letters, at least 2 numbers, 2 special characters and above 8 chars

/*
so basically takes inserted input trough these 4 checks to put it in a category, key point here is not to make a
point system that actually evaluates a passwords strength but to instead put it in one of these categories,
kinda dumb but i don't make the exercises
if it does not comply with these categories then its unknown strength
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution25 {
    public static int passwordValidator(String password){
        //converts password to pass array and sets traits
        char[] pass = password.toCharArray();
        boolean numonly = true;
        boolean charonly = true;
        boolean specialchar = false;

        //checks to see if entire password is numbers or characters
        for(char c : pass){
            if(Character.isDigit(c)){
                charonly = false;
            }else{
                numonly = false;
            }
        }
        //Checks for special characters using matcher
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(password);
        boolean containsSpecialCharacters = matcher.find();
        if(containsSpecialCharacters){
            specialchar = true;
        }

        //Below a score is assigned to password depending on the traits we've defined above
        if(password.length() < 8 && numonly){
            return -2;
        }
        if(password.length() < 8 && charonly){
            return -1;
        }
        if(password.length() >= 8 && !charonly && !numonly && !specialchar ){
            return 1;
        }
        if(password.length() >= 8 && !charonly && !numonly){
            return 2;
        }
        return 0;
    }

    //Output takes returned value from validator and generates correct output
    public static void output(int passwordValidator,String password){
        String judgement = switch (passwordValidator) {
            case -2 -> "very weak";
            case -1 -> "weak";
            case 0 -> "uncategorized 8+ character or number only";
            case 1 -> "strong";
            case 2 -> "very strong";
            default -> "unrecognizable";
        };
        System.out.println("The password " + password + " is a " + judgement + " password");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a password");
        String password = input.nextLine();//Main Scans for Input and transfers data between functions

        int passwordValidator = Solution25.passwordValidator(password);

        output(passwordValidator,password);
    }
}
