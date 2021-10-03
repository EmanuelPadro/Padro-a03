package baseline;

import java.util.Arrays;

public class Solver24 {
    String word1;
    String word2;
    boolean isAnagram;

    Solver24(String input1, String input2){
        word1 = input1;
        word2 = input2;
        isAnagram = anagramTest(input1,input2);
        //in order to not use static variables, this statement checks if user wants output and calls function if so
        print(input1,input2,isAnagram);
    }

    public static boolean anagramTest(String word1, String word2) {
        if (word1.length() != word2.length()) {//compares if words of equal length
            return false;
        } else {
            char[] word1Array;//creating character arrays
            char[] word2Array;
            word1Array = word1.toCharArray();//puts string into array
            word2Array = word2.toCharArray();
            Arrays.sort(word1Array);//Q cant sort both arrays at once
            Arrays.sort(word2Array);
            return word1Array != word2Array; //will test to see if both sorted arrays are equal
        }
    }

    public static void print(String word1, String word2, boolean isAnagram){
        if(isAnagram){
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        }else{
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are not anagrams.");
        }
    }
}
