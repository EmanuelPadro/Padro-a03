package baseline;

import java.util.Scanner;

//only ended up needed a single method to complete this
public class Solution28 {
    public static double addloop(){//declared as double to support decimal numbers as well as ints
        Scanner input = new Scanner(System.in);
        //create a rray to store numbers
        double [] nums = new double[5];
        double sum = 0;

        //loop that adds the number to the array each time and keeps going til filled in
        for( int i = 0 ; i < 5; i++ )
        {
            System.out.println("Enter a number: ");
            nums[i] = input.nextDouble();
            System.out.println(nums[i]);
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        double addloop = addloop();
        System.out.println("The total is " + addloop);

    }
}
