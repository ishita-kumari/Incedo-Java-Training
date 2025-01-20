package day3.B;

import java.util.*;

public class CensoredWordRemoval {
    static boolean isCensoredWord(String word){
        String[] censoredWords = {
                "abuse", "asshole", "bastard", "bitch", "bloody", "cock", "cunt", "damn", "dick",
                "douche", "fag", "faggot", "fuck", "goddamn", "hell", "idiot", "jackass", "jerk",
                "motherfucker", "prick", "pussy", "rape", "shit", "slut", "sonofabitch", "stupid",
                "swine", "tranny", "whore", "wanker", "dickhead", "racist", "terrorist", "sexually",
                "violence", "hate", "bomb", "nigger", "kike", "spic", "gook", "chink", "raghead"
        };
        List<String> censoredWordsList = Arrays.asList(censoredWords);
        if(censoredWordsList.contains(word.trim()))return true;
        return false;
    }
    

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        System.out.println("Type something then press enter, " +
                "or type \"end\" to end the program");
        while (!(word = scanner.next()).equals("end")) {
            String currWord = word.toLowerCase();
            if(isCensoredWord(currWord)){
                System.out.println("You typed a censored word, Be aware.");
            }
            else System.out.println("You typed " + currWord + "!");
        }
        System.out.println("Program ended!");
        scanner.close();
    }
}
