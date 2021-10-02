package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Emanuel_Padro
 */


//number guesser

public class exercise32 {


    //This method gets user input and puts in object
    public static void StartProgram(){
        int difficulty = 0;
        //will ask for difficulty then get random number
        //then will pass that to loop function
        loop(Solver.RandoNumber(difficulty));
    }

    public static void loop(int RandomNumber){
        //loop will set up a counter (to zero) and then will trap user inside
        // of it until they guess the number it was given
        //once exit loop it will ask if y/n if yes calls Start Program if no end program

    }

    //main is main
    public static void main(String[] args) {
        StartProgram();

    }
}
