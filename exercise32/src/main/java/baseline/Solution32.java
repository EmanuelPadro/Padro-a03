package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Emanuel_Padro
 */

import java.util.Scanner;

//changed code as to not require another class
public class Solution32 {
    //function that returns the random number when given the dif level
    public static int Difficulty(){
        Scanner scanner = new Scanner(System.in);
        int Upbound;

        System.out.println("Enter the difficulty level (1,2, or 3): ");
        int UserInput = Integer.parseInt(scanner.next());
        //will take user input(difficulty) and set bound to that level
        switch (UserInput) {
            case 1 -> Upbound = 10;
            case 2 -> Upbound = 100;
            case 3 -> Upbound = 1000;
            default -> throw new IllegalStateException("Unexpected value: Please enter 1,2 or 3 " + UserInput);
        }
        //inline variable displays formula used to generate random number from 1 to Upbound
        return (int)Math.floor(Math.random()*(Upbound - 1 +1)+1);

    }
    //game function that takes loops for guesses until it matches given number while counting guesses then returns the number guesses
    public static int Game(int randomNum){
        Scanner scanner = new Scanner(System.in);
        System.out.print("I have my number what is your guess? ");
        int Guess;
        int GuessCount = 0;
        do {
            Guess = scanner.nextInt();
            if (Guess < randomNum) {
                System.out.print("Too low. Guess again: ");
            } else if (Guess > randomNum) {
                System.out.print("Too high. Guess again: ");
            }
            GuessCount = GuessCount + 1;
        }while(Guess != randomNum);

        return GuessCount;
    }
    //outro function that prints guesses and asks to rerun program
    public static void Looper(){
        char PlayAgain;
        //loop will keep going as long as y is inputted at end
        do {
            int RandomNum = Difficulty();
            int GuessCount = Game(RandomNum);

            //checks to print appropriate output depending on # guesses
            if(GuessCount == 1){
                System.out.println("You got it in a single guess!");
            }else{
                System.out.println("You got it in " + GuessCount + " guesses!");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you wish to play again? (y/n)? ");
            PlayAgain = scanner.next().charAt(0);

        }while(PlayAgain == 'y');
    }

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!\n");
        Looper();

    }
}
