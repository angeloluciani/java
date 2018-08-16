import java.util.regex.Pattern;

public class Example3 {

	public static void main (String [] args) {

		String regexStr = "\\s";
		String sourceStr = "foo bar baz";

		Pattern pattern = Pattern.compile(regexStr);
		String [] ss = pattern.split(sourceStr);
		System.out.println("Split [" + sourceStr + "] with [" + regexStr + "]");

		for (String s : ss) {

			System.out.println(s);
		}
	}
}