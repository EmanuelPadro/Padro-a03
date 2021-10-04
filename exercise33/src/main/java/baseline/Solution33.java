package baseline;

import java.util.Scanner;

public class Solution33 {
    static void AskQuestion(){
        Scanner Scanner = new Scanner(System.in);
        //prompts for user question they type it in and prints randomized answer

        System.out.println("What is your question? ");
        Scanner.next();

        String Answer = Magic8Ball.MagicBallsJudgement();
        System.out.println(Answer);

    }

    public static void main(String[] args) {
        AskQuestion();
    }

}
