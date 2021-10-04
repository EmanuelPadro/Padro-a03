package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Emanuel_Padro
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {

    //Generates the list
    static ArrayList<String> ListGenerator(){
        ArrayList<String> Employees = new ArrayList<>();

        Employees.add("John Smith");
        Employees.add("Jackie Jackson");
        Employees.add("Chris Jones");
        Employees.add("Amanda Cullen");
        Employees.add("Jeremy Goodwin");

        System.out.println("There are 5 employees: ");

        for (String employee : Employees) {
            System.out.println(employee);
        }

        return Employees;
    }

    //method that removes the employee from the list
    private static void RemoveEmployee(ArrayList<String> Employees) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter an employee name to remove: ");
        String RemoveName = scanner.nextLine();
        Employees.remove(RemoveName);

        System.out.println("\n");
        for (String employee : Employees) {
            System.out.println(employee);
        }

    }

    public static void main(String[] args) {
        ArrayList<String> Employees = ListGenerator();
        RemoveEmployee(Employees);
    }

}
