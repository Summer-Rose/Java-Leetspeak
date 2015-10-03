import java.io.Console;
import java.util.Arrays;

public class Leetspeak {
	Console console = System.console();
    public static void main(String[] args) {}

    public String leetspeak(String phrase) {
       	String replacedPhrase = replaceLetters(phrase);
    	String newString = dealsWithS(replacedPhrase);
    	String finalString = newString.substring(0, newString.length() -1);
    	return finalString;
    }

    public String replaceLetters(String words) {
    	return words.replace("e", "3").
   			 		 replace("E", "3").
    		   		 replace("o", "0").
    		  	 	 replace("O", "0").
    	 	   		 replace("i", "1").
   		       		 replace("I", "1").
   		       		 replace("s", "z").
   		       		 replace("S", "Z");
    }

    public String dealsWithS(String words) {
    	String[] wordsArray = words.split("\\s+");
    	String resultingWords = "";
    	for (String word : wordsArray) {
    		if(word.substring(0,1).equals("z")) {
    			resultingWords += ("s" + word.substring(1, word.length()) + " ");
    		} else if (word.substring(0,1).equals("Z")) {
    			resultingWords += ("S" + word.substring(1, word.length()) + " ");
    		} else {
    			resultingWords+=(word + " ");
    		}
    	}
    	return resultingWords;
    }
}
