import java.io.Console;
import java.util.Arrays;

public class Leetspeak {
	Console console = System.console();
    public static void main(String[] args) {}

    public String leetspeak(String phrase) {
    	// String[] words = phrase.split("\\s+");
    	// String[] replacedWords = replaceLetters(words);
    	// return replacedWords;
    	String replacedPhrase = replaceLetters(phrase);
    	return replacedPhrase;
    }

    public String replaceLetters(String words) {
    	return words.replace("e", "3").
   			 		 replace("E", "3").
    		   		 replace("o", "0").
    		  	 	 replace("O", "0").
    	 	   		 replace("i", "1").
   		       		 replace("I", "1");
    }
}
