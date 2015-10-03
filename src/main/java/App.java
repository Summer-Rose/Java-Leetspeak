import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
	public static void main(String[] args) {
		String layout = "templates/layout.vtl";

		get("/", (request, response) -> {
			HashMap<String, Object> model = new HashMap<String, Object>();
			model.put("template", "templates/index.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());

		post("/leetspeak", (request, response) -> {
			HashMap<String, Object> model = new HashMap<String, Object>();
			String text = request.queryParams("text");
			String leetspeak = leetspeak(text);
			model.put("text", text);
			model.put("leetspeak", leetspeak);
			model.put("template", "templates/index.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());
	}

	public static String leetspeak(String phrase) {
       	String replacedPhrase = replaceLetters(phrase);
    	String newString = dealsWithS(replacedPhrase);
    	String finalString = newString.substring(0, newString.length() -1);
    	return finalString;
    }

    public static String replaceLetters(String words) {
    	return words.replace("e", "3").
   			 		 replace("E", "3").
    		   		 replace("o", "0").
    		  	 	 replace("O", "0").
    	 	   		 replace("i", "1").
   		       		 replace("I", "1").
   		       		 replace("s", "z").
   		       		 replace("S", "Z");
    }

    public static String dealsWithS(String words) {
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