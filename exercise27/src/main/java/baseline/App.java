package baseline;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


/*Each of the get functions takes input and evaluate using if statements and other text/pattern recognition so that
    it can attribute errors to it, add those to a list and then return the value once it is done so it can be uploaded
    to the database class later in the Load function
     */
public class App {

    static String GetFirstName(ArrayList<String> Errors){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the First name: ");
        String FirstName = Scanner.next();
        //regex will replace any instance of double spaces with a single 1
        FirstName = FirstName.replaceAll("\\s+"," ");
        //these if statements check if string entered is blank or less than 2 characters respectively
        if(FirstName.isBlank()){
            Errors.add("First Name must be filled in");
        }
        if(FirstName.length() <= 3){
            Errors.add("First Name must be at least 2 characters long");
        }
        return FirstName;
    }

//same as above
    static String GetLastName(ArrayList<String> Errors){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the Last name: ");
        String LastName = Scanner.next();
        LastName = LastName.replaceAll("\\s+"," ");
        if(LastName.isBlank()){
            Errors.add("Last Name must be filled in");
        }
        if(LastName.length() <= 3){
            Errors.add("Last Name must be at least 2 characters long");
        }
        return LastName;
    }

    static String GetZipCode(ArrayList<String> Errors){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the Zipcode: ");
        String ZipCode = Scanner.next();
        ZipCode = ZipCode.replaceAll("\\s+"," ");
        if(ZipCode.isBlank()){
            Errors.add("Zipcode Name must be filled in");
        }//this pattern form checks to make sure 5 digits are inputted
        if(!ZipCode.matches("\\d{5}")){
            Errors.add("Zipcode must be 5 digit number");
        }
        return ZipCode;
    }

    static String GetEmployeeID(ArrayList<String> Errors){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the employee ID: ");
        String ID = Scanner.next();
        ID = ID.replaceAll("\\s+"," ");
        //This string patter is established and it has to be 2 characters a dash and 4 digits
        String IDpattern = "\\c{2}-\\d{4}";

        if(!Pattern.matches(IDpattern,ID)){
            Errors.add("The employee ID must be in the format of AA-1234.");
        }
        return ID;
    }

    public static void Load(ArrayList<String> Errors){
        //for each error prints it ready for future implementation of automatic program restart
        for(String error:Errors){
            System.out.println(error);
        }//check if no errors added to database
        if(Errors.isEmpty()){
            System.out.print("No errors found");
        }
    }

    public static void main(String[] args) {
        //creates error list and calls to fill in everything (almost ready for loop
        ArrayList<String> Errors = new ArrayList<>();
        String FirstName = GetFirstName(Errors);
        String LastName = GetLastName(Errors);
        String ZipCode = GetZipCode(Errors);
        String EmployeeID = GetEmployeeID(Errors);
        Load(Errors);
        new ex27.ex27Database(FirstName,LastName,ZipCode,EmployeeID);


    }
}
