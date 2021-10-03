package baseline;

import java.util.Scanner;

public class Solution {
    public static double Input(){
        Scanner input = new Scanner(System.in);
        double r = 72;
        boolean valid;

        do {
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
        return 72/r;
    }

    public static void main(String[] args) {

        double years = Solution.Input();
        System.out.print(years);

    }
}