import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example4 {

	public static void main (String [] args) {

		String [] phrases = {"Chew the fat", "Cat got your tongue", 
		"Do a Devon Loch", "Hairy at the heel", "Have a one track mind!", 
		"More holes than a Swiss cheese", "When pigs fly"};

		String regexStr = "[A-Z]o";
		int matchFlag = Pattern.CASE_INSENSITIVE;
		Pattern pattern = Pattern.compile(regexStr, matchFlag);
		System.out.println("Regex pattern (CASE_INSENSITIVE): " + regexStr);

		for (String phrase : phrases) {

			Matcher matcher = pattern.matcher(phrase);

			while (matcher.find()) {

				System.out.println("[" + matcher.group() + "] found in [" + phrase + "]");
			}
		}
	}
}