package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Emanuel_Padro
 */

import java.util.Scanner;

public class Solution31 {
    //gathers input from  user
    public static void Input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your resting pulse? ");
        TargetHeartRate.FillPulse(scanner.nextInt());

        System.out.println("What is your age? ");
        TargetHeartRate.FillAge(scanner.nextInt());

    }

    //prints results from class
    public static void Print(){
        double Intensity = 0.55;
        int Rate,DisplayIntensity;
        System.out.print("Resting Pulse: " + TargetHeartRate.ReturnPulse());
        System.out.println("    Age: " + TargetHeartRate.ReturnAge());

        System.out.println("Intensity    | Rate");
        System.out.println("---------------------");

        while(Intensity <= 1){
            Rate = TargetHeartRate.THRCalc(Intensity);
            DisplayIntensity = (int)(100*Intensity);
            System.out.format("%d%%          | %3d bpm\n",DisplayIntensity,Rate);

            Intensity = Intensity + 0.05;
        }
    }

    public static void main(String[] args) {
        Input();
        Print();
    }
}
