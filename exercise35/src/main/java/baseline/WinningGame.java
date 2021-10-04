package baseline;

import java.util.ArrayList;

public class WinningGame {
    static ArrayList<String> Players = new ArrayList<>();


    //method removes a player
    static void RemoveWinners(String Input){
        Players.remove(Input);
    }


    static String WinnerPicker(){

        int WinnerNum = (int)Math.floor(Math.random()*(Players.size()+1));
        return Players.get(WinnerNum);

    }
}
