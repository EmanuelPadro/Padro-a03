package baseline;

import java.util.Scanner;

//Changes were made to the ideas I had when I begun pesudocing the project
//A more object based solution approach will be used


//I will use a new class called details that will contain all the details based of the parameters plugged into it
class Details
{
    double b;
    double i;
    double p;
    // a constructor will perform all the calculations and allow other methods to call them
    Details(double balance, double dailyrate, double monthlypayment)
    {
        b = balance;
        i = dailyrate/36500;
        p = monthlypayment;
    }
}

public class PaymentCalculator {
    //This method will calculate the months until the ammount is paid off when given the details of a person
    public static int calculateMonthsUntilPaidOff(Details person1)
    {
        double n =Math.ceil
                (
                -(1.0/30)* Math.log10( 1 + (person1.b/person1.p)*(1 - Math.pow((1 + person1.i), 30)))
                        / (Math.log10(1 + person1.i ))
        );
        Math.ceil(n);
        return (int) n;
    }

    //method that collects user input and fills in details so that it can be used in another fucntion
    static Details CollectInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance?");
        double balance = input.nextDouble();
        System.out.println("What is the APR on the card (as a percent)?");
        double dailyrate = input.nextDouble();
        System.out.println("What is the monthly payment you can make?");
        double monthlypayment = input.nextDouble();
        return new Details(balance,dailyrate,monthlypayment);

    }

    //main is main
    public static void main(String[] args)
    {
        Details person1 = CollectInput();

        int calculateMonthsUntilPaidOff = PaymentCalculator.calculateMonthsUntilPaidOff(person1);// or this
        System.out.println("it will take you " + calculateMonthsUntilPaidOff + " months to pay off this card");
    }
}
//should you be naming stuff differently when you can such as when passing to fucntions and classes