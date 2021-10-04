package baseline;

import java.util.Scanner;

public class App35 {

    static void Input(){
        Scanner scanner = new Scanner(System.in);
        String Input;

        do{
            System.out.print("Enter a name: ");
            Input = scanner.nextLine();
            if(!Input.isEmpty()) {
                WinningGame.Players.add(Input);
            }
        }while(!Input.isEmpty());
    }
    //
    static void Printer(){
        String Winner = WinningGame.WinnerPicker();
        System.out.print("The winner is.... "+ Winner + "!");
    }

    public static void main(String[] args) {
        Input();
        Printer();
    }
}
