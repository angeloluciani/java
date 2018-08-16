import java.util.regex.Pattern;

public class Example1 {

	public static void main (String [] args) {

		String regexStr = ".oo.";
		String sourceStr = "look";
		
		boolean result = Pattern.matches(regexStr, sourceStr );
		System.out.println("[" + regexStr + "] found in [" + sourceStr + "] : " + result);
	}
}