package baseline;

public class Magic8Ball {
    public static String MagicBallsJudgement(){
        String Answer;
        //generates random number
        int RandomNum = (int)Math.floor(Math.random()*(4 - 1 +1)+1);

        //based on random number gives response
        Answer = switch (RandomNum) {
            case 1 -> "Yes.";
            case 2 -> "No.";
            case 3 -> "Maybe.";
            case 4 -> "Ask again later.";
            default -> throw new IllegalStateException("Error: I don't feel like it" + RandomNum);
        };

        return Answer;
    }
}

